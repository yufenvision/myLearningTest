package algorithm;

import java.util.*;

/**
 * @Author: dyf
 * @Date: 2021/1/15 21:10
 * @Description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 提示：
 *     2 <= nums.length <= 103
 *     -109 <= nums[i] <= 109
 *     -109 <= target <= 109
 *     只会存在一个有效答案
 *
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] xx1 = {2,7,11,15};
        int[] test = {1,3,4,2};
        int[] test1 = {3,3};
        int[] result = twoSumMap(xx1, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] twoSumMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i < nums.length; i++){
            int current = nums[i];
            int temp = target - current;
            if(map.containsKey(temp)){
                result[0] = map.get(temp);
                result[1] = i;
            }
            map.put(current,i);
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};

        for(int i=0; i < nums.length; i++){
            int temp = target - nums[i];
            for (int j = i + 1; j< nums.length; j++){
                if(temp == nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
