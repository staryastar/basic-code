package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月24日 21:58:08
 */
public class DemoArray {
    public static void main(String[] args) {

//        int[] array01 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            array01[i] = i + 1;
//        }
//
//        int[] array02;
//        array02 = new int[5];
//
//        long[] array03 = new long[]{1L, 2L, 3L};
//
//        long[] array04 = {1L, 2L, 3L};
//
//        int i = 5;
//        changeInt(i);
//        System.out.println(i);


        int[] arr = null;
//        changeArr(arr);
        for (int a : arr) {
            System.out.println(a);
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void changeArr(int[] other) {
        other[1] = 100;
    }

    public static void changeInt(int i) {
        i = 10;
    }
}
