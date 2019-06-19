package io.thinkinjava.directory;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @Author: dyf
 * @Date: 2019/6/19 22:25
 * @Description: 目录的检查及创建
 */
public class MakeDirectories {
    public static void main(String[] args){
        File file = new File("H:\\Java7");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));

    }


}
