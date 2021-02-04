package com.lqb.algorithm;

import java.util.HashSet;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        for (int age = 11 ; age <=100 ; age++){
            String  age3 = String.valueOf(Math.pow(age,3));
            String  age4 = String.valueOf(Math.pow(age,4));
            if(age3.length() == 4 & age4.length() == 6 & Check(age3,age4)){
                System.out.print(age);
                break;
            }
        }
    }
    public static boolean Check(String age3, String age4) {
        String str = age3 + age4;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size() == 10;
    }
}
