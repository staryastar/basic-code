package cn.star.day05.demo02;

/**
 * @author xin5
 * @date 2021年08月04日 22:14:00
 */
public class Cat implements Animal {

    @Override
    public void run() {
        System.out.println("猫在跑。。。");
    }

    @Override
    public void eat() {
        System.out.println("猫吃小鱼。。。");

    }
}
