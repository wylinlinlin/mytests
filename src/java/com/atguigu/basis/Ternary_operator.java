package com.atguigu.basis;

/**
 * @ClassName: com.atguigu.basis.Ternary_operator
 * @Author: 夏泽城
 * @Date: 2021/2/4 15:29
 * @Version: 1.0
 **/

public class Ternary_operator {
    public static void main(String[] args) {
        int x = 40;
        int y = 50;
        int z = 35;
        int max1 = (x > y )?x:y;
        int max2 = (max1 > z)?max1:z;
        System.out.println("max="+max2);

    }
}
