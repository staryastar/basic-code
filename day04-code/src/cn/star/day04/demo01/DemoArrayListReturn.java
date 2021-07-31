package cn.star.day04.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xin5
 * @date 2021年07月29日 22:44:16
 */
public class DemoArrayListReturn {
    public static void main(String[] args) {

        System.out.println(returnList1(returnList()));

//        byte[] byteArray = { 1, 2, 3 };
//        System.out.println(byteArray);


    }

    public static ArrayList<Integer> returnList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(101) + 1;
            list.add(num);
        }
        System.out.println(list);
        return list;
    }

    public static ArrayList<Integer> returnList1(ArrayList<Integer> list) {
        ArrayList<Integer> ilist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 ) {
                ilist.add(list.get(i));
            }
        }
        return ilist;
    }

}
