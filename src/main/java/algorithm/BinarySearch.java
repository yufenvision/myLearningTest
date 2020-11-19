package algorithm;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/19 10:33
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,5,44,121,400,500,8888};
        System.out.println(binarySearch(121,a));
    }

    public static int binarySearch(int ele,int[] a){
        int minIndex = 0;
        int maxIndex = a.length-1;
        int midIndex = (minIndex + maxIndex)/2;
        while(minIndex<=maxIndex){
            if(a[midIndex]>ele){
                maxIndex = midIndex - 1;
            }else if(a[midIndex]<ele){
                minIndex = midIndex + 1;
            }else{
                return midIndex;
            }

            midIndex = (minIndex + maxIndex)/2;
        }
        return -1;
    }
}
