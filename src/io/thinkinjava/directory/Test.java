package io.thinkinjava.directory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dyf
 * @Date: 2019/6/19 17:18
 * @Description:
 */
public class Test {

    public static void main(String[] args){
//        List<File> fileList = new ArrayList<>();
//        PPrint.pprint(getAllFile(new File("D:\\nfs\\media"), ".*", fileList));
//          MakeDirectories.main(new String[]{"-d","E:/xxxx"});
        System.out.println(f(4));
    }
    //自己写的获取当前文件目录下的所有文件
    public static List<File> getAllFile(File file, String regex, List<File> fileList){
        for (File item : file.listFiles()) {
            if(item.isDirectory())
                getAllFile(item, regex, fileList);
            else{
                if(item.getName().matches(regex))//正则匹配过滤
                    fileList.add(item);
            }
        }
        return fileList;
    }

    public static int f(int i){
        if(i == 1){
            return 1;
        }else if(i == 2){
            return 2;
        }else{
            return f(i-1) + f(i - 2);
        }
    }
}
