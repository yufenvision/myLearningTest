package io.directory;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author: dyf
 * @Date: 2019/6/19 15:41
 * @Description: 目录实用工具
 */
public final class Directory {

    public static File[] local(File dir,final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
    }

    public static File[] local(String dir,final String regex){
        return local(new File(dir), regex);
    }

    public static class TreeInfo implements Iterable<File> {//递归关键代码
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {//实现了iterable接口后，它将产生文件，使你拥有在文件列表上的“默认迭代”,也就是说可以用foreach循环来遍历treeInfo
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString(){
            return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    public static TreeInfo walk(String start, String regex){
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex){
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(String start){
        return recurseDirs(new File(start), ".*");//Everything
    }

    static TreeInfo recurseDirs(File startDir, String regex){
        TreeInfo result = new TreeInfo();
        for (File item: startDir.listFiles()) {
            if(item.isDirectory()){
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            }else{
                if(item.getName().matches(regex))
                    result.files.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args){
        if(args.length == 0){
            System.out.println(walk("src"));
        }else{
            for (String arg: args) {
                System.out.println(walk(arg));
            }
        }
//            System.out.println(walk("D:/nfs/media/",".*.png$"));
    }

}
