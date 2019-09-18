package collection.list;

import java.util.LinkedList;

/**
 * @Author: dyf
 * @Date: 2019/9/17 09:46
 * @Description: LinkedList具有能够直接实现栈的所有功能的方法，因此可以直接将LinkedList作为栈使用，下面为举例
 */
public class Stack<T> {//我们在声明一个可以持有T类型对象的Stack
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v){
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "storage=" + storage +
                '}';
    }

    public LinkedList<T> getStorage() {
        return storage;
    }
}
