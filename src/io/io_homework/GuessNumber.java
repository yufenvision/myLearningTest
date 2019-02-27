package io.io_homework;

import java.util.Scanner;

public class GuessNumber {

	/**
	 *  ͨ������̨���н����Ĳ�������Ϸ,��ϷЧ�����£�
		i.	��Ϸ��ʼ������̨��ӡ��ʾ���·�Χ
		ii.	�û����Դӿ���̨����µ����ݣ�Ȼ��س��ύ
		iii.��������û���������������жϣ����ڿ���̨��ӡ��ʾ���� ��С�ˣ�����
		iv.	�����޶����� ������10��
		v.	��̨����ʵ������������Լ�������ǰ֪���������Ƚ���Ȥζ�ԣ�������ò�Ҫ�û���һ�����̨��һ�ι�

	 */
	public static void main(String[] args) {
		System.out.println("������0~9������");
		int num=0;
		int goalNunmber = (int) (Math.random()*10);
		while(num<10){
			num++;
			Scanner sc = new Scanner(System.in);
			int guessNum = sc.nextInt();
			if(guessNum == goalNunmber){
				System.out.println("��ϲ�㣡��"+num+"�β����ˣ���ȷ�����ǣ�"+goalNunmber);
				sc.close();
				break;
			}else{
				if(num == 10){
					System.out.println("You Lose,���ϧ.....��ȷ�����ǣ�"+goalNunmber);
					sc.close();
				}else{
					if(guessNum > goalNunmber){
						System.out.println("���ź�����´��ˣ��㻹��"+(10-num)+"�λ���");
					}else{
						System.out.println("���ź������С�ˣ��㻹��"+(10-num)+"�λ���");
					}	
				}
			}
//			
		}
		
		
		
	}

}
