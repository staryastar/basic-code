package cn.star.day02.demo01;

/**
 * @author xin5
 * @date 2021年07月24日 23:08:36
 */
public class DemoReverse {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
        reserse(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        System.out.println("=========");

        reverse1(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
    }

    public static void reserse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = a;
        }
    }

    public static void reverse1(int[] array) {
        for (int min = 0, max = array.length-1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;

        }
    }

}
