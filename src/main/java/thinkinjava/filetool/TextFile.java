package thinkinjava.filetool;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: dyf
 * @Date: 2019/6/20 15:50
 * @Description:
 */
public class TextFile extends ArrayList<String> {
    //Read a file as a single String;读取一个文件为字符串
    public static String read(String filename){
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader in = new BufferedReader(
                    new FileReader(
                            new File(filename).getAbsoluteFile()
                    )
            );
            try {
                String s;
                while((s = in.readLine()) != null){
                    sb.append(s);
                    sb.append("\n");
                }
            }finally {
                in.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    //Write a single file in one method call:打印一个文件
    public static void write(String filename, String text){
        try {
            PrintWriter out = new PrintWriter(
                    new File(filename).getAbsoluteFile()
            );
            try {
                out.print(text);
            }finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Read a file, split by any regular expression:读一个文件，根据正则，拆分为集合
    public TextFile(String filename, String splitter){
        super(Arrays.asList(read(filename).split(splitter)));
        //Regular expression split() often leaves an empty用了正则将字符串转为集合，常常会留下空白
        //String at the first position:
        if(get(0).equals(""))remove(0);

    }
    //Normally read by lines:正常的一行行读取
    public TextFile(String fileName){
        this(fileName, "\n");
    }
    public void write(String filename){
        try{
            PrintWriter out = new PrintWriter(
                    new File(filename).getAbsoluteFile()
            );
            try {
                for(String item : this)
                    out.println(item);
            }finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Simple test:测试
    public static void main(String[] args){
        String file = read("D:/eclipse_neon/eclipse/workspace/myTest/src/io/thinkinjava/filetool/TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("text2.txt");
//        //Break into unique sorted list of words;
//        TreeSet<String> words = new TreeSet<>(new TextFile("TextFile.java", "\\W+"));
//        //Display the capitalized words:
//        System.out.println(words.headSet("a"));

    }
}
