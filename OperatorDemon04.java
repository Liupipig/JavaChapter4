package com.itheima.opterator;

public class OperatorDemon04 {
    public static void main(String[] args) {
        //掌握扩展赋值运算符
        double a = 9.5;
        double b = 520;
        a += b;
        System.out.println(a);

        double i = 600;
        double j = 520;
        i -= j;
        System.out.println(i);

        int m = 10;
        int n = 5;
        m *= n;
        //m /= n;
        //m %= n;
        System.out.println(m);

        System.out.println("----------------------------------");
        int x = 10;
        char y = 'a';
        x += y;
        System.out.println(x);
    }
}
