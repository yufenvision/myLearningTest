package java_collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/23 11:22
 */
public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.get(0));

        LinkedList link1 = new LinkedList();
        link1.add(4);//尾插法
        link1.add(5);
        link1.add(6);

        System.out.println(link1.getFirst());
        System.out.println(link1.getLast());


    }
}
