package myArrays;

public class MylinkList {
	/*
	 * 创建Node类
	 * 里面两个字段
	 * 一个存放值Object obj
	 * 另外一个 存下一个节点的地址 Node next;
	 * 我们应该把传入的值，封装起来 -- 传过来的值，存放到Node里面
	 * 提供一个构造方法存储我们的的值
	 */

	private class Node{
		Object obj;
		Node next;
		
		Node(Object obj){
			this.obj = obj;
		}
	}
	
	
	
	//最开始什么值都没有
	Node first;
	//提供一个size;
	int size;
	//添加方法
	public void add(Object obj){
		//怎么写?
		Node n = new Node(obj);
		if(first == null){
			first = n;
		}else{
			//添加第二个，第三个怎么定义一个临时Node让它执行first
			Node temp = first;
			//循环的判断temp.next是否为空，如果不为空，移动Node节点
			while(temp.next != null){
				temp = temp.next;//这个随时在移动的
			}
			//while循环完之后，temp.next == null
			temp.next = n; 
		}
		size++;
	}
	
	/* 提供一个方法，把size返回
     * 需要实现[123,456,你好]效果
     * 分析：1）取出链表里面的每个值
     * 	   2）可以把值拼接起来
     */
	
	public int getSize(){
		return size;
	}
	//覆写toString方法
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node n = first;
		if(first != null){
			if(first.next == null){
				sb.append(first.obj);
			}else{
				sb.append(first.obj).append(",");
			}
			
		}
		while(n.next !=null){
			n = n.next;
			if(n.next == null){//就是最后一个节点了
				sb.append(n.obj);
			}else{
				sb.append(n.obj).append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}

