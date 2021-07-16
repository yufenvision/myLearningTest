package designmode.construct_mode.proxy.proxy_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/**
 * @Author: dyf
 * @Date: 2020/11/10 19:45
 * @Description:
 */
public class CompareClass {

    public static void main(String[] args) {

        Class<Calculator> calculatorClass = Calculator.class;
        Class<CalculatorImpl> calculatorImplClass = CalculatorImpl.class;

        Constructor[] constructorsClass = calculatorClass.getConstructors();
        Method[] methodsClass = calculatorClass.getMethods();

        Constructor[] constructorsImplClass = calculatorImplClass.getConstructors();
        Method[] methodsImplClass = calculatorImplClass.getMethods();

        System.out.println("------接口Class的构造器信息------");
        printExecutable(constructorsClass);
        System.out.println("------接口Class的方法信息------");
        printExecutable(methodsClass);

        System.out.println("------实现类Class的构造器信息------");
        printExecutable(constructorsImplClass);
        System.out.println("------实现类Class的方法信息------");
        printExecutable(methodsImplClass);

    }


    public static void printExecutable(Executable[] executables){
        for (Executable executable : executables) {
            String name = executable.getName();
            StringBuilder sb = new StringBuilder(name);
            sb.append('(');
            Class[] clzParams = executable.getParameterTypes();
            for (Class param : clzParams) {
                sb.append(param.getName()).append(',');
            }
            if(clzParams !=null && clzParams.length !=0){
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(')');
            System.out.println(sb);
        }



    }

}


