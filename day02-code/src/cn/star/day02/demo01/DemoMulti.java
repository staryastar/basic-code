package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月21日 22:44:29
 */
public class DemoMulti {
    public static void main(String[] args) {
        multi(10,20);
        System.out.println("==========");

        System.out.println(multi(15,20));
        System.out.println("==========");

        int result = multi(20,20);
        System.out.println(result);
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}
