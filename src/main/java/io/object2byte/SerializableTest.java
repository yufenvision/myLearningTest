package io.object2byte;

import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/28 14:40
 */
public class SerializableTest {

    //序列化到磁盘
    public static void writeObject2Disk(Object object, String diskPath){
        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(diskPath))
        ){
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //从磁盘反序列化到JVM内存
    public static <T> T disk2Object(String diskPath){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(diskPath))){
            T reuslt = (T) objectInputStream.readObject();
            return reuslt;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static void main(String[] args) {
        Student student = new Student("小明",18,1);
        String jsonStudent = JSON.toJSONString(student);
        System.out.println(jsonStudent);
//        writeObject2Disk(student, "E:/test.txt");
//        writeObject2Disk(JSON.toJSONString(student),"E:/testJsonIn.txt");
//        Student studentFromDisk = disk2Object("E:/test.txt", Student.class);
        Student studentFromDisk = disk2Object("E:/test.txt");
        System.out.println(studentFromDisk);
        String studentFromDisk2 = disk2Object("E:/testJsonIn.txt");
        System.out.println(studentFromDisk2);

        //看gson源码
    }

}
