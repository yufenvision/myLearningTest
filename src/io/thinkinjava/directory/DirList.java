package io.thinkinjava.directory;

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
public class DirList implements FilenameFilter {
    public static void main(String[] args) throws IOException {
        File path = new File(".");
        System.out.println(path.getAbsolutePath());
        System.out.println(path.getCanonicalPath());
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirList(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }

    }
    private Pattern pattern;

    public DirList(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
