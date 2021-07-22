package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月22日 22:26:40
 */
public class DemoComparison {
    public static void main(String[] args) {
        System.out.println(compare((byte) 10, (byte) 20));
        System.out.println(compare((short) 20, (short) 20));
        System.out.println(compare(30, 20));
        System.out.println(compare(40L, 20L));
    }

    public static boolean compare(byte a, byte b) {
        System.out.println("这里是byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("这里是short");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("这里是int");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("这里是long");
        return a == b;
    }
}
