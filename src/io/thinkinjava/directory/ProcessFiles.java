package io.thinkinjava.directory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dyf
 * @Date: 2019/6/19 21:54
 * @Description: 在目录中穿行，并且根据Strategy对象来处理这些目录中的文件（这是策略设计模式的另一个示例）。。。。。。。没整懂
 */
public class ProcessFiles {
    public interface Strategy{
        void process(File file);
    }
    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }
    public void start(String[] args){
        try{
            if(args.length == 0)
                processDirectoryTree(new File("."));
            else
                for(String arg : args){
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else
                        //Allow user to leave off extension
                        if(!arg.endsWith("." + ext));
                            arg += "." + ext;
                        strategy.process(new File(arg).getCanonicalFile());
                }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void processDirectoryTree(File root) throws IOException{
        for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext)) {
            strategy.process(file);
        }
    }
    //声明如何使用它
    public static void main(String[] args){
//        List<File> list = new ArrayList<>();
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                System.out.println(file);
//                list.add(file);
            }
        },".java").start(args);
    }
}
