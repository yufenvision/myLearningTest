package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: dyf
 * @Date: 2021/1/15 21:10
 * @Description:
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] xx = {11,7,11,2};
        int[] xx1 = {2,7,11,15};

        System.out.println(twoSum(xx1, 9));

    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Map map = new HashMap();
        for(int i=0; i < nums.length; i++){
            map.put(i, nums[i]);
        }
        for(int i=0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsValue(temp)){
                list.add(i);
            }
        }

        System.out.println(list);
        return null;
    }
}
