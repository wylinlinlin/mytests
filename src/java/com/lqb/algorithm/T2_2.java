package com.lqb.algorithm;

import com.lqb.algorithm.T2_1;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: com.lqb.algorithm.T2_2
 * @Author: 夏泽城
 * @Date: 2021/1/31 14:25
 * @Version: 1.0
 **/

public class T2_2 {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 4, 9};
        fullSort(arr,0, arr.length-1);
        System.out.println(set.size());
    }
    public static void fullSort(int[] arr,int start,int end){
        if (start == end){
            int num = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
            T2_1.r(set, num);
        }
        for (int a = start; a <= end;a++){
            swap(arr,start,a);
            fullSort(arr,start+1,end);
            swap(arr,start,a);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int c = arr[i];arr[i] = arr[j]; arr[j] = c;
    }
}