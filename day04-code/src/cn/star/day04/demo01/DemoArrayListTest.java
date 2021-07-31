package cn.star.day04.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xin5
 * @date 2021年07月28日 23:01:14
 */
public class DemoArrayListTest {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(34));
        }

        System.out.println(list);
        System.out.println("primitive");

    }
}
