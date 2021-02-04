package algorithm;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/28 16:46
 */
public class CenterNumTest {
    public static void main(String[] args) {
        int[] nums = {};
        int[] num2 = {1,7,3,6,5,6};
        System.out.println(pivotIndex(num2));
    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            right = right + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(left == right) return i;
            left += nums[i];
            if(i + 1 < nums.length){
                right -= nums[i + 1];
            }
        }
        return -1;
    }
}
