package cc.oneo.leetcode.array;

import java.util.HashMap;

/**
 * @author jingfeng.ccc
 * @Description
 * @version: $Id: SumsOfTwo, V0.1 2021-07-25
 */
public class SumsOfTwo {

    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexes[0] = i;
                indexes[1] = hash.get(nums[i]);
                return indexes;
            }

            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }

        return indexes;
    }
}
