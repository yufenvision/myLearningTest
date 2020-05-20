package thinkinjava.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author: dyf
 * @Date: 2019/6/12 20:40
 * @Description:
 */
public class DirList{
    public static void main(String[] args) throws IOException {
        File path = new File(".");
        System.out.println(path.getAbsolutePath());
        System.out.println(path.getCanonicalPath());
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));//list可以回调accept，进而可以决定哪些文件包含在列表中，更具体的说，这是一个策略模式的例子
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            File file = new File(dirItem);
            System.out.println(file.getName() + ":" + file.length());//大小单位字节
        }
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}


