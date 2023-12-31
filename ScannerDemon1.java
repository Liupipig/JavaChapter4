package scanner;

import java.util.Scanner;

public class ScannerDemon1 {
    public static void main(String[] args) {
        //API获取用户输入的数据的使用方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的年龄:");
        int age = sc.nextInt();
        System.out.println("您的年龄是" + age);
        System.out.println("请您输入您的名字:");
        String name = sc.next();
        System.out.println("欢迎" + name + "进入系统");
    }
}
