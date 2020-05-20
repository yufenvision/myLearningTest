package myTest;

public class Regex {
	public static void main(String[] args) {
		
		String points = " 39377253.544798 3305514.259821";

		System.out.println(points.replaceAll("^ ", "").replace(" ",","));
	}
}
