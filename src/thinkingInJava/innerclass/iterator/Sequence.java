package thinkingInJava.innerclass.iterator;

/**
 * @Author: dyf
 * @Date: 2019/6/27 19:25
 * @Description: 要获取Sequence中的每一个对象，可以使用Selector接口。这是“迭代器”设计模式的一个例子
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        this.items = new Object[size];
    }
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next() {
            if(i < items.length)i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }

    //当某个外围类的对象创建了一个内部类对象时，此内部类对象必定会秘密的捕获一个指向那个外围类对象的引用
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for (int i = 0; i< 10 ; i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        sequence = new Sequence(5);
        sequence.add(new Outer("一").inner());
        sequence.add(new Outer("二").inner());
        sequence.add(new Outer("三").inner());
        sequence.add(new Outer("四").inner());
        sequence.add(new Outer("五").inner());
        selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
