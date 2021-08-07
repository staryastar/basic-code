package cn.star.day05.demo01;

import java.util.ArrayList;

/**
 * @author xin5
 * @date 2021年08月03日 23:24:56
 */
public class Manager extends User {

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        if (totalMoney > super.getMoney()) {
            System.out.println("余额不足");
            return arrayList;
        }

        int lastMoney = super.getMoney() - totalMoney;
        super.setMoney(lastMoney);

        int red = totalMoney / count;
        int remainder = totalMoney % count;

        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                arrayList.add(red + remainder);
                break;
            }
            arrayList.add(red);
        }

        return arrayList;
    }
}
