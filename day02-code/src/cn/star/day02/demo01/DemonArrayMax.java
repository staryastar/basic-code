package cn.star.day02.demo01;

import java.sql.SQLOutput;

/**
 * @author xin5
 * @date 2021年07月24日 22:41:03
 */
public class DemonArrayMax {
    public static void main(String[] args) {

        int[] array = {1000, 200, 20, 4, 5};
        int result = maxArray(array);
        System.out.println(result);

    }

    public static int maxArray(int[] array1) {
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            max = max >= array1[i] ? max: array1[i];



        }
        return max;
    }
}
