package cn.star.day04.demo02;

/**
 * @author xin5
 * @date 2021年08月01日 21:35:43
 */
public class ArrayUtil {


    public static void arrayReverse(int[] array) {

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
             int temp = array[min];
             array[min] = array[max];
             array[max] = temp;
        }

    }

}
