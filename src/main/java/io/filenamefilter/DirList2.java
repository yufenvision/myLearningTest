package io.filenamefilter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author: dyf
 * @Date: 2019/6/12 21:00
 * @Description:
 */
public class DirList2 {
    public static void main(String[] args) throws IOException {
//        String[] argss = {"^\\.[a-z]+"};
//        DirList.main(argss);
        File path = new File(".");
        System.out.println(path.getAbsolutePath());
        System.out.println(path.getCanonicalPath());
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(filter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

}
