package java_base.reflect;

import java_base.reflect.service.SomeService;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/18 10:49
 */
public class GetAllImplByInterfaceTest {


    public static void main(String[] args){
        Class<SomeService> superClz = SomeService.class;
        long start = System.currentTimeMillis();
        //本包扫描实现类
        getImplsByLocalScan(superClz).forEach(v -> {
            try {
                System.out.println(v.newInstance().getClass());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println("本包扫描耗时：" + (System.currentTimeMillis() - start));
        //全项目扫描实现类

        long two = System.currentTimeMillis();
        List<Class<SomeService>> classes = getImplsByAllScan(superClz);
        classes.forEach(v -> {
            try {
                System.out.println(v.newInstance().getClass());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        System.out.println("全项目扫描耗时：" + (System.currentTimeMillis() - two));

    }

    //递归获取项目所有文件的全路径
    public static List<String> getAllFileName(File file, List<String> fileNames){
        if(file.isFile()){//文件
            fileNames.add(file.getPath());
        }else {//文件夹
            File[] subFile = file.listFiles();
            for (File f : subFile) {
                if(f.isFile()){
                    fileNames.add(f.getPath());
                }else {
                    getAllFileName(f, fileNames);
                }
            }
        }
        return fileNames;
    }

    public static <T>List<Class<T>> getAllSubClass(File file, Class<T> superClz){
        List<Class<T>> classes = new ArrayList<>();
        getAllFileName(file, new ArrayList<>()).stream().filter(v -> v.endsWith(".class"))
                .map(v -> v.replaceAll(".*classes\\\\|\\.class",""))
                .map(v -> v.replace("\\","."))
                .forEach(v -> {
                    try {
                        Class clz = Class.forName(v);
                        if(superClz.isAssignableFrom(clz))classes.add(clz);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });
        classes.remove(superClz);
        return classes;
    }

    public static <T>List<Class<T>> getImplsByAllScan(Class<T> superClz){
        if(!superClz.isInterface())return Collections.EMPTY_LIST;
        String classPath = superClz.getClassLoader().getResource("").getPath();
        return getAllSubClass(new File(classPath), superClz);
    }

    public static <T>List<Class<T>> getImplsByLocalScan(Class<T> superClz){
        if(!superClz.isInterface())return Collections.EMPTY_LIST;
        String classPath = superClz.getClassLoader().getResource("").getPath();
        String packagePath = superClz.getPackage().getName().replace(".","/");
        return getAllSubClass(new File(classPath + packagePath), superClz);
    }




}
