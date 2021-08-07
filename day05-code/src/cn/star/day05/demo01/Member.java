package cn.star.day05.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xin5
 * @date 2021年08月03日 23:40:36
 */
public class Member extends User {

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {

        Random random = new Random();
        int index = random.nextInt(list.size());

        int temp = list.remove(index);

        super.setMoney(super.getMoney() + temp);

    }
}
