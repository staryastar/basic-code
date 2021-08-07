package cn.star.day04.demo02;

import java.util.Arrays;

/**
 * @author xin5
 * @date 2021年08月01日 21:48:55
 */
public class ArrayUtilTest {
    public static void main(String[] args) {

        int[] intArray = {1, 3, 5, 7, 9};
        ArrayUtil.arrayReverse(intArray);

        System.out.println(Arrays.toString(intArray));

    }
}
