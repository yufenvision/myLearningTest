package java_collection.list.linkedlist;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/23 10:05
 * 两个足够大的数，用链表来相加
 *
 *
 */
public class TwoBigNumAddByLinkedList {
    public static void main(String[] args) {
        LinkNode l1 = new LinkNode(1).add(2).add(3);
        LinkNode l2 = new LinkNode(6).add(9).add(6).add(9);

        System.out.println(l1.reverse());//反向打印
        System.out.println(l2.reverse());

        /*
            计算：123 + 696 = 819
            123 + 6969 = 7092
         */
        System.out.println(add(l1, l2));
    }

    public static LinkNode add(LinkNode l1, LinkNode l2){
        LinkNode result = null;//保存上一个node引用
        boolean carryIn = false;//进位输入
        while (l1 != null || l2 != null){//知道不都为null则继续运算
            Integer value = (l1 == null? 0 : l1.value) + (l2 == null ? 0 : l2.value);
            LinkNode count = new LinkNode(value);
            carryIn = countAndCarryOut(count, carryIn);
            if(result != null)count.next = result;
            result = count;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(carryIn){//最终进位
            LinkNode count = new LinkNode(1);
            count.next = result;
            result = count;
        }
        return result;
    }

    public static boolean countAndCarryOut(LinkNode linkNode, boolean carryIn){
        boolean carryOut = false;
        Integer value = linkNode.value;
        if(carryIn){
            value += 1;//进位输入
            carryOut = false;
        }
        if(value >= 10)carryOut = true;//进位输出
        linkNode.value = value % 10;
        return carryOut;
    }

}




class LinkNode{
    int value;
    LinkNode next;
    public LinkNode(int value) {
        this.value = value;
    }
    public LinkNode add(int value){
        LinkNode nextNode = new LinkNode(value);
        nextNode.next = this;//头插法
//        this.next = nextNode;//尾插法
        return nextNode;
    }

    public LinkNode reverse(){
        LinkNode source = this;
        LinkNode linkNode = null;
        while (source != null){
            LinkNode node = new LinkNode(source.value);
            node.next = linkNode;
            linkNode = node;
            source = source.next;
        }
        return linkNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkNode linkNode = this;
        while (linkNode != null){
            sb.append(linkNode.value).append(",");
            linkNode = linkNode.next;
        }
        return sb.substring(0,sb.lastIndexOf(","));
    }
}