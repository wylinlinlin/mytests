package com.lqb.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: com.lqb.algorithm.T2_1
 * @Author: 夏泽城
 * @Date: 2021/1/31 14:04
 * @Version: 1.0
 **/

public class T2_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[]{1,9,4,9};
        for (int a = 0; a < arr.length;a++){
            for (int b = 0; b < arr.length;b++){
                if (b==a) continue;
                for (int c = 0; c < arr.length;c++){
                    if (c==a || c ==b) continue;
                    for (int d = 0; d < arr.length;d++){
                        if (d==a || d == b || d == c) continue;
                        int num = arr[a]*1000 + arr[b]*100 + arr[c]*10 + arr[d];
                        r(set, num);
                    }
                    }
                }
            }
        System.out.println(set.size());
        System.out.println(set.toString());
        }

    static void r(Set<Integer> set, int num) {
        boolean r = true;
        for ( int i = 2; i <=Math.sqrt(num);i++){
            if (num % i == 0) {
                r = false;
                break;
            }
        }
        if (r) {
            set.add(num);
            }
    }
}
