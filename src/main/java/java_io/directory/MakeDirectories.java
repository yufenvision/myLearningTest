package java_io.directory;

import java.io.File;

/**
 * @Author: dyf
 * @Date: 2019/6/19 22:25
 * @Description: 目录的检查及创建
 */
public class MakeDirectories {
    private static void usage(){
        System.err.println(
          "Usage:MakeDirectories path1 ...\n" +
          "Creates each path\n" +
          "Usage:MakeDirectories -d path1 ...\n" +
          "Deletes each path\n" +
          "Usage:MakeDirectories -r path1 path2\n" +
          "Renames form path1 to path2"
        );
        System.exit(1);
    }
    private static void fileData(File f){
        System.out.println(
                "Absolute path:" + f.getAbsolutePath() +
                "\n Can read: " + f.canRead() +
                "\n Can write: " + f.canWrite() +
                "\n getName: " + f.getName() +
                "\n getParent: " + f.getParent() +
                "\n getPath: " + f.getPath() +
                "\n length(byte): " + f.length() +
                "\n lastModified: " + f.lastModified()
        );
        if(f.isFile())
            System.out.println("这是一个文件");
        else if(f.isDirectory())
            System.out.println("这是一个目录");
    }

    public static void main(String[] args){
        if(args.length < 1)usage();
        if(args[0].equals("-r")){
            if(args.length !=3) usage();
            File
                    old = new File(args[1]),
                    rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;//Exit main函数
        }

        int count = 0;
        boolean del = false;
        if(args[0].equals("-d")){
            count++;
            del = true;
        }
        count--;
        while(++count < args.length){
            File f = new File(args[count]);
            if(f.exists()){
                System.out.println(f + " exists存在");
                if(del){
                    System.out.println("deleting..." + f);
                    f.delete();
                }
            }else{//不存在
                if(!del){
                    f.mkdirs();
                    System.out.println("created 已创建" + f);
                }
            }
            fileData(f);
        }

    }


}
