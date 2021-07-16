package designmode.construct_mode.adapter.objectadapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author: dyf
 * @Date: 2019/6/4 23:05
 * @Description:
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();//我们不能支持迭代器的remove()方法，所以放弃，这里我们抛出一个异常
    }
}
