package java_base.reflect;

import java_base.reflect.service.SomeService;
import java_base.reflect.service.impl.AServiceImpl;

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


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<SomeService> superClz = SomeService.class;
        String classPath = superClz.getClassLoader().getResource("").getPath();
        System.out.println(classPath);
        File file = new File(classPath);

        List<String> allClzPath = getAllFileName(file, new ArrayList<>());
        //获取所有class类对象
        List<Class<?>> classes = new ArrayList<>();
        allClzPath.stream().filter(v -> v.endsWith(".class"))
                .map(v -> v.replaceAll(".*classes\\\\|\\.class",""))
                .map(v -> v.replace("\\","."))
                .forEach(v -> {
//            System.out.println(v);
            try {
                Class clz = Class.forName(v);
                if(superClz.isAssignableFrom(clz))classes.add(clz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
        classes.forEach(v -> System.out.println(v));
//        getAllDirectory(file, new LinkedList<>()).forEach(v -> System.out.println(v));

    }

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

    public static LinkedList<String> getAllDirectory(File file, LinkedList<String> directoryNames){
        if(file.isDirectory()){//文件夹
            String parentFileName = directoryNames.size() != 0 ? directoryNames.getLast() + "." : "";
            directoryNames.add(parentFileName + file.getName());
            File[] subFile = file.listFiles();
            for (File f : subFile) {
                if(f.isDirectory()){
                    directoryNames.add(file.getName() + "." + f.getName());
//                    getAllDirectory(f, directoryNames);
                }
            }
        }
        return directoryNames;
    }

    public <T>List<Class<? extends T>> getAllSubClassObjBySuperClass(Class<T> superClz){
        if(!superClz.isInterface())return Collections.EMPTY_LIST;
        String classPath = superClz.getClassLoader().getResource("").getPath();

        File[] files = new File(classPath).listFiles();
        for (File file : files) {

        }

        List<Class<? extends T>> allSubClzs = new ArrayList<>();
        //判断是否是superClz实现类，是的话放入

        return null;
    }





}
