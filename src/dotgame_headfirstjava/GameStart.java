package dotgame_headfirstjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月19日 下午3:52:54
* 类说明
*/
public class GameStart {
	public static void main(String[] args) {
		
		//创建1艘战舰
		DotWarShip ship = new DotWarShip();
		ship.setName("无畏级战舰");
//		Integer x = (int) (Math.random()*5);
		Integer x = 0;
		System.out.println(x);
		ship.setLocationCells(new ArrayList<>(Arrays.asList(x,x+1,x+2)));
		//玩家输入坐标来猜测战舰位置，返回结果和猜了几次
		int guessNum = 0;
		while (ship.getHp() !=0 ){
			int playerGuess = playerInupt();
			String result = ship.isHitOrKill(playerGuess);
			guessNum++;
			System.out.println(result);
			if(ship.getHp() == 0){
				System.out.println("一共猜了" + guessNum + "次，击沉战舰" );
			}
		};
		
	}
	
	
	
	public static Integer playerInupt(){
		System.out.print("请输入战舰位置：");
		Scanner sc = new Scanner(System.in);
		Integer location = sc.nextInt();
		return location;
	}
}
