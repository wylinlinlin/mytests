package com.atguigu.basis;

/**
 * @ClassName: com.atguigu.basis.Operatortest
 * @Author: 夏泽城
 * @Date: 2021/2/4 15:19
 * @Version: 1.0
 **/

public class Operatortest {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z =40;
        if ((z++ ==40) && (y = true)){
            z++;
        }
        if ((x = false) || (++z == 43)){
            z++;
        }
        System.out.println("z = "+ z);
    }
}
