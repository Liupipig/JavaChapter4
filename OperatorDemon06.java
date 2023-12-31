package com.itheima.opterator;

public class OperatorDemon06 {
    public static void main(String[] args) {
        //掌握逻辑运算符的使用
        //要求手机尺寸必须满足6.95且内存必须大于8
        double size = 6.8;
        int storage = 16;
        boolean res = size >= 6.95 & storage >= 8;
        System.out.println(res);

        //要求手机尺寸要么满足6.95，要么内存必须大于8
        boolean res2 = size >= 6.95 | storage >= 8;
        System.out.println(res2);

        //！取反
        boolean res3 = !(true);
        boolean res4 = !(false);

        //亦或
        System.out.println(true ^ true);
        System.out.println(false ^ true);

        //短路与，左边为false右边不执行
        int i = 10;
        int j = 20;
//        System.out.println(i > 100 && ++j > 99);
        System.out.println(i > 100 & ++j > 99);
        System.out.println(j);

        //短路或，左边为true右边不执行
        int m = 10;
        int n = 30;
        System.out.println(m > 3 || ++n > 40);
//        System.out.println(m > 3 || ++n > 40);
        System.out.println(n);
    }
}
