package com.itheima.opterator;

public class OperatorDemon07 {
    public static void main(String[] args) {
        double score = 95;
        String  res = score >= 60 ? "及格" : "不及格";
        System.out.println(res);

        //找出2个整数中的较大值
        int a = 99;
        int b = 67;
        String res01 = a >= b ? "a的数值最大" + a:"b的数值最大" + b;
        System.out.println(res01);

        //找3个整数中的较大值
        int i = 99;
        int j = 45;
        int k = 34;
        int res02 = i >= j? i:j;
        int res03 = res02 >= k? res02:k;
        System.out.println(res03);

    }
}
