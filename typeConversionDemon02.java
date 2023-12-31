package com.itheima.type;

public class typeConversionDemon02 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        long c = 30l;
        long sum = a + b + c;
        System.out.println(sum);

        double sum2 = a + b + 1.0;
        System.out.println(sum2);

        byte i = 10;
        short j = 30;
        int k = i + j;
        System.out.println(k);

        //面试笔试题
        byte b1 = 10;
        byte b2 = 80;
        int sum3 = b1 + b2;
        System.out.println(sum3);
    }
}
