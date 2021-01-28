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
        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                right = right + nums[j];
            }
            if(left == right) return i;
            left = left + nums[i];
            right = 0;
        }
        return -1;
    }
}
