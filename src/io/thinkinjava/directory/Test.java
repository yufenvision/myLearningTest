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
        List<File> fileList = new ArrayList<>();
        PPrint.pprint(getAllFile(new File("H:/Java视频/源代码教育Java面试题视频"), ".*", fileList));
    }
    //自己写的获取当前文件目录下的所有文件
    public static List<File> getAllFile(File file, String regex, List<File> fileList){
        for (File item : file.listFiles()) {
            if(item.isDirectory()){
                getAllFile(item, regex, fileList);
            }else{
                if(item.getName().matches(regex)){
                    fileList.add(item);
                }
            }
        }
        return fileList;
    }
}
