package io.thinkinjava.directory;

import java.io.File;

/**
 * @Author: dyf
 * @Date: 2019/6/19 21:01
 * @Description:
 */
public class DirectoryDemo {
    public static void main(String[] args){
        //所有目录
        PPrint.pprint(Directory.walk(".").dirs);
        //所有以T开头的文件
        for (File file: Directory.walk(".","T.*"))
            System.out.println(file);
        System.out.println("--------------------------------");
        //所有以T开头的java文件
        for (File file: Directory.walk(".","T.*\\.java"))
            System.out.println(file);
        System.out.println("================================");
        //包含Z或者z的.class文件
        for (File file: Directory.walk(".",".*[Zz].*\\.class"))
            System.out.println(file);
    }
}
