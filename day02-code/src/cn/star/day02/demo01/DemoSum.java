package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月21日 23:11:06
 */
public class DemoSum {
    public static void main(String[] args) {
        sum();
    }



    public static void sum() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
