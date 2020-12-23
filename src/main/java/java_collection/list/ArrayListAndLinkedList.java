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

        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println(arrayList.get(0));
        System.out.println(linkedList.get(0));

    }
}
