package myArrays;

public class MylinkList {
	/*
	 * ����Node��
	 * ���������ֶ�
	 * һ�����ֵObject obj
	 * ����һ�� ����һ���ڵ�ĵ�ַ Node next;
	 * ����Ӧ�ðѴ����ֵ����װ���� -- ��������ֵ����ŵ�Node����
	 * �ṩһ�����췽���洢���ǵĵ�ֵ
	 */

	private class Node{
		Object obj;
		Node next;
		
		Node(Object obj){
			this.obj = obj;
		}
	}
	
	
	
	//�ʼʲôֵ��û��
	Node first;
	//�ṩһ��size;
	int size;
	//��ӷ���
	public void add(Object obj){
		//��ôд?
		Node n = new Node(obj);
		if(first == null){
			first = n;
		}else{
			//��ӵڶ�������������ô����һ����ʱNode����ִ��first
			Node temp = first;
			//ѭ�����ж�temp.next�Ƿ�Ϊ�գ������Ϊ�գ��ƶ�Node�ڵ�
			while(temp.next != null){
				temp = temp.next;//�����ʱ���ƶ���
			}
			//whileѭ����֮��temp.next == null
			temp.next = n; 
		}
		size++;
	}
	
	/* �ṩһ����������size����
     * ��Ҫʵ��[123,456,���]Ч��
     * ������1��ȡ�����������ÿ��ֵ
     * 	   2�����԰�ֵƴ������
     */
	
	public int getSize(){
		return size;
	}
	//��дtoString����
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
			if(n.next == null){//�������һ���ڵ���
				sb.append(n.obj);
			}else{
				sb.append(n.obj).append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}

