package com.itheima.type;

public class typeConversionDemon01 {
    public static void main(String[] args) {
        //自动类型转换
        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 100;
        double d = c;
        System.out.println(d);

        char ch = 'a';
        int i = ch;
        System.out.println(i);
    }
}
