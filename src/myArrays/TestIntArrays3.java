package myArrays;

public class TestIntArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrays3<Integer> arr = new IntArrays3();
		arr.add(10);
		arr.add(1120);
		arr.add(10);
		arr.add(12);
		arr.add(60);
		arr.add(8);
//		arr.add('a');
//		arr.add("込込");
		arr.add(1237);
//		arr.add(true);
		arr.add(237);
		arr.add(137);
		System.out.println(arr.getSize());
		System.out.println(arr.toString());
		System.out.println(arr.getElementByIndex(3));
		System.out.println(arr.getFirstIndexByElement("込込"));
		arr.deleteIndex(7);
		System.out.println(arr);
		arr.deleteFirstElement(10);
		System.out.println(arr);
		
	}

}
