package cn.star.day03.demo01;

import java.util.Scanner;

/**
 * @author xin5
 * @date 2021年07月27日 22:10:06
 */
public class DemoScannerMax {
    public static void main(String[] args) {

        System.out.println("请输入3个数：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] array = {num1, num2, num3};
        System.out.println("最大值：" + max(array));
    }

    public static int max(int[] array) {
        int max = array[0];
//        for (int i = 1; i <= array.length - 1; i++) {
//            max = max >= array[i] ? max : array[i];
//        }

        int i = 1;
//        while (i <= array.length - 1) {
//            max = max >= array[i] ? max : array[i];
//            i++;
//
//        }

        do {
            max = max >= array[i] ? max : array[i];
            i++;

        } while (i <= array.length - 1);

        return max;
    }


}
