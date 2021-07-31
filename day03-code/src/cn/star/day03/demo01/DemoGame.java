package cn.star.day03.demo01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xin5
 * @date 2021年07月27日 22:52:55
 */
public class DemoGame {
    public static void main(String[] args) {

        int result = new Random().nextInt(101);

        System.out.println("请输入你猜测值的大小");

        Scanner sc = new Scanner(System.in);


        int num;

        do {

            num = sc.nextInt();

            if (num < result) {
                System.out.println("您输入的值太小啦" + num);


            } else if (num > result) {
                System.out.println("您输入的值太大啦" + num);
            } else {
                System.out.println("您猜对了！" + num);
            }


        } while (num != result);

    }
}
