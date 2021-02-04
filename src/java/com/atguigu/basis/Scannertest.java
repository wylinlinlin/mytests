package com.atguigu.basis;

/**
 * @ClassName: Scannertest
 * @Author: 夏泽城
 * @Date: 2021/2/4 16:04
 * @Version: 1.0
 **/

public class Scannertest {
    public static void main(String[] args) {
//        Scanner scan  = new Scanner(System.in);
//        System.out.println("请输入你的姓名：");
//        String name = scan.next();
//        System.out.println("请输入你的学号：");
//        int sno = scan.nextInt();
//        System.out.println("请输入你的成绩：");
//        int num = scan.nextInt();
//        System.out.println("姓名:"+name+"\n学号:"+sno+"\n成绩:"+num);
        int value = (int)(Math.random()*90+10);
        //[a,b]     -->   (int)(Math.random()*(b-a+1)+a)
        System.out.println("value:"+value);
    }
}
