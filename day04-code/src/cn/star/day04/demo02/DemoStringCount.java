package cn.star.day04.demo02;

import java.util.Scanner;

/**
 * @author xin5
 * @date 2021年07月31日 21:58:56
 * 题目：键盘输入一个字符串，输出该字符串中有多少个小写字母、大写字母、数字以及其他
 */
public class DemoStringCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.next();

        int lowerCaseCount = 0;
        int uperCaseCount = 0;
        int numCount = 0;
        int otherCount = 0;

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if ('A' <= charArray[i] && 'Z' >= charArray[i]) {
                uperCaseCount++;
            } else if ('a' <= charArray[i] && 'z' >= charArray[i]) {
                lowerCaseCount++;
            } else if ('0' <= charArray[i] && '9' >= charArray[i]) {
                numCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("大写字母的个数是： " + uperCaseCount);
        System.out.println("小写字母的个数是： " + lowerCaseCount);
        System.out.println("数字的个数是： " + numCount);
        System.out.println("其他字符的个数是： " + otherCount);



    }
}
