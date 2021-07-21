package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月21日 22:14:42
 */
public class DemoTriangle {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
