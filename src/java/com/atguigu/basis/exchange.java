package com.atguigu.basis;

/**
 * @ClassName: com.atguigu.basis.exchange
 * @Author: 夏泽城
 * @Date: 2021/2/4 15:34
 * @Version: 1.0
 **/

public class exchange {
    public static void main(String[] args) {
        String str1 = "南京";
        String str2 = "北京";

        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("str1:"+str1+"\nstr2:"+str2);
    }
}
