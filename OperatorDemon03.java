package com.itheima.opterator;

public class OperatorDemon03 {
    public static void main(String[] args) {
        int c= 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        //C     11
        //d     5
        //rs3   10+12-5-4+1+12
        System.out.println(rs3);//22
        System.out.println(c);//11
        System.out.println(d);//5
        int rs4 = 10+12-5-4+1+12;
        System.out.println(rs4);

        int m = 5;
        int n = 3;
        //m  4
        //n  3
        //res  6-5+5-4+4+3
        int res = ++m - --m + m-- - ++n + n-- +3;
    }
}
