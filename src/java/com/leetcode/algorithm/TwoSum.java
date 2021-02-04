package com.leetcode.algorithm;

import java.util.Arrays;

/**
 * @ClassName: com.leetcode.algorithm.TwoSum
 * @Author: 夏泽城
 * @Date: 2021/1/31 14:49
 * @Version: 1.0
 **/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
            System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i <n;i++){
            for (int j = i+1; j <n;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}

