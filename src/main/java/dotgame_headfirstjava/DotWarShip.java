package dotgame_headfirstjava;

import java.util.Iterator;
import java.util.List;

/**
* @author 作者 dyf:
* @version 创建时间：2019年1月19日 下午3:39:18
* 类说明
*/
public class DotWarShip {
	
	private String name;
	
	private int hp = 3; 
	
	private List<Integer> locationCells;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public List<Integer> getLocationCells() {
		return locationCells;
	}

	public void setLocationCells(List<Integer> locationCells) {
		this.locationCells = locationCells;
	}

	public String isHitOrKill(int location){
//		for (Integer cell : locationCells) {
//			if(location == cell.intValue()){
//				this.hp--;
//				if(hp == 0){
//					return "Kill-" + this.name;
//				}
//				locationCells.remove(cell);//这里删除后return了,所以不会触发java.util.ConcurrentModificationException错误
//				return "Hit!" + this.name;
//			}
//			
//		}
		String result = "Miss" + this.name;
		Iterator<Integer> it = this.locationCells.iterator();
		while(it.hasNext()){
			if(location == it.next()){
				this.hp--;
				if(hp == 0){
					result = "Kill-" + this.name;
				}
				it.remove();
				result = "Hit!" + this.name;
			}
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "DotWarShip [name=" + name + ", hp=" + hp + ", locationCells=" + locationCells + "]";
	}
	
	
	
}
