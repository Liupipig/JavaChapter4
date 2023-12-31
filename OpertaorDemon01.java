package com.itheima.opterator;

public class OpertaorDemon01 {
    public static void main(String[] args) {
        //掌握基本的算术运算符使用
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        int i = 5;
        int j = 2;
        System.out.println(1.0*i / j);

        System.out.println("----------------------------");
        int a1 = 5;
        System.out.println("abc" + a1);
        System.out.println(5 + a1);
        System.out.println("itheima" + a1 + 'a');//itheima5a
        System.out.println(a1 + 'a' + "itheima");//102itheima
    }
}
