package java_base.reflect;

import java_base.reflect.service.SomeService;
import java_base.reflect.service.impl.AServiceImpl;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/30 12:53
 */
public class GetAllClassByAnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        List<String> list = loadPackage("java_base.reflect.service.impl", ImplBean.class);
        list.forEach(v -> System.out.println(v));

        ImplBean annotation = AServiceImpl.class.getAnnotation(ImplBean.class);
        System.out.println(annotation.value());
    }


    //1）、通过项目中controller包的全限定名，获取该包下所有类的全限定名（注解判断是否为controller类）。
    public static List<String> loadPackage(String packageName, Class annotationClz) throws ClassNotFoundException{
        List<String> controllerNames = new ArrayList<>();
        URL url = Thread.currentThread().getContextClassLoader().getResource(packageName.replace(".", "/"));
        File file = new File(url.getFile());
        String[] classNames = file.list();
            for (String clzName : classNames) {
                String allName = packageName + "." + clzName.replace(".class","");
                //判断controller类是否有注解
                boolean isAnnotation = Class.forName(allName).isAnnotationPresent(annotationClz);
                if(isAnnotation){
                    controllerNames.add(allName);
                }
            }
        return controllerNames;
    }

    //多个controller包
    public static Map<String, List<String>> loadPackage(String[] packages, Class annotationClz) throws ClassNotFoundException{
        Map<String,List<String>> maps = new HashMap<>();
        for (String packageName : packages) {
            List<String> controllerNames = loadPackage(packageName, annotationClz);
            maps.put(packageName, controllerNames);
        }
        return maps;
    }

    //2）、根据controller类的全限定名，获取该类下所有方法名（注解判断是否添加该方法，方法别名），然后持久化resource对象。
//    public static List<Resource> importController(String clzName) throws ClassNotFoundException{
//        List<Resource> resources = new ArrayList<>();
//        Class<?> clz = Class.forName(clzName);
//        //获取类别名
//        TabResource ctab = clz.getAnnotation(TabResource.class);
//        String controllerAlias = "".equals(ctab.value())?clz.getName():ctab.value();
//
//        Method[] methods = clz.getDeclaredMethods();
//        for (Method method : methods) {
//            if(method.isAnnotationPresent(TabResource.class)){
//                //获取方法别名
//                TabResource tab = method.getAnnotation(TabResource.class);
//                String methodAlias = controllerAlias+":"+!"".equals(tab.value()) != null?tab.value():method.getName();
//                String methodName = clzName+":"+method.getName();
//
//                //模拟数据库持久化操作.....
//                Resource resource = new Resource();
//                resource.setController(clzName);
//                resource.setName(methodAlias);
//                resource.setUrl(methodName);
//                resources.add(resource);
//            }
//        }
//        return resources;
//    }

//    public static List<String> getAllMethodPath(List<String> controllers){
//        List<String> paths = new ArrayList<>();
//        controllers.forEach(v -> {
//            try {
//                Class clz = Class.forName(v);
//                RequestMapping requestMapping = (RequestMapping) clz.getAnnotation(RequestMapping.class);
//                String controllerPath = requestMapping.value()[0];
//                Method[] methods = clz.getMethods();
//                for (Method method : methods) {
//                    String methodPath = "";
//                    RequestMapping reqMapping = method.getAnnotation(RequestMapping.class);
//                    if(reqMapping != null){
//                        RequestMethod[] requestMethods = reqMapping.method();
//                        methodPath = controllerPath + reqMapping.value()[0];
//                        if(requestMethods != null && requestMethods.length > 0){
//                            methodPath = requestMethods[0] + methodPath;
//                        }
//                    }else {
//                        GetMapping getMapping = method.getAnnotation(GetMapping.class);
//                        if(getMapping != null){
//                            methodPath = "GET" + controllerPath + getMapping.value()[0];
//                        }else {
//                            PostMapping postMapping = method.getAnnotation(PostMapping.class);
//                            if(postMapping !=null){
//                                methodPath = "POST" + controllerPath + postMapping.value()[0];
//                            }
//                        }
//                    }
//                    if(StringUtils.isNotBlank(methodPath)) paths.add(methodPath);
//                }
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//        });
//
//
//        return paths;
//    }
}
