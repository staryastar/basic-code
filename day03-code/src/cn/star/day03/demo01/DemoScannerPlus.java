package cn.star.day03.demo01;


import java.util.Scanner;

/**
 * @author xin5
 * @date 2021年07月27日 21:59:34
 */
public class DemoScannerPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        System.out.println(num2);

        System.out.println("两个数之和：" + (num1 + num2));

    }
}
