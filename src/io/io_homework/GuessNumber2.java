package io.io_homework;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {

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
		
		guess(10);
		
		
//		int num=0;
//		int goalNunmber = (int) (Math.random()*10);
//		while(num<10){
//			num++;
//			Scanner sc = new Scanner(System.in);
//			int guessNum = sc.nextInt();
//			if(guessNum == goalNunmber){
//				System.out.println("��ϲ�㣡��"+num+"�β����ˣ���ȷ�����ǣ�"+goalNunmber);
//				sc.close();
//				break;
//			}else{
//				if(num == 10){
//					System.out.println("You Lose,���ϧ.....��ȷ�����ǣ�"+goalNunmber);
//					sc.close();
//				}else{
//					if(guessNum > goalNunmber){
//						System.out.println("���ź�����´��ˣ��㻹��"+(10-num)+"�λ���");
//					}else{
//						System.out.println("���ź������С�ˣ��㻹��"+(10-num)+"�λ���");
//					}	
//				}
//			}
//		}
		
	}
	
	public static void guess(int count){
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		Random r = new Random();
		//���������
		int goalNum = r.nextInt(9);
		String str;
		while(count>0){
			count--;
			str = sc.next();
			int guessNum = Integer.parseInt(str);
			if(guessNum > goalNum){
				System.out.println("���ˣ����У�"+ count + "�λ��ᣡ");
			}else if(guessNum < goalNum){
				System.out.println("С�ˣ����У�"+ count + "�λ��ᣡ");
			}else{
				System.out.println("��ϲ�㣬�н�500W");
				break;
			}
		}
		if(count == 0){
			System.out.println("��ȷ�Ĵ𰸣�" + goalNum);
		}
	}

}
