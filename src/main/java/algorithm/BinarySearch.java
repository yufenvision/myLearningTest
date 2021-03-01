package algorithm;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/19 10:33
 * 二叉树算法
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,5,44,121,400,500,8888};
        System.out.println(binarySearch(121,a));

        System.out.println(recurseSearch(121, a));
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
        return -1;//找不到就-1
    }

    //递归实现
    public static int recurseSearch(int min, int max, int ele, int[] src){
        int mid = (min + max)/2;
        if(min <= max){
            if(ele == src[mid]){
                return mid;
            }else {
                min = ele > src[mid] ? mid + 1 : min;
                max = ele < src[mid] ? mid -1 : max;
                return recurseSearch(min, max, ele, src);
            }
        }
        return -1;
    }

    public static int recurseSearch(int ele, int[] src){
        return recurseSearch(0, src.length -1 , ele, src);
    }


}
