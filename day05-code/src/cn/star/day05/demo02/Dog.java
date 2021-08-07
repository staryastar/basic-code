package cn.star.day05.demo02;

/**
 * @author xin5
 * @date 2021年08月04日 22:16:21
 */
public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("狗在跑");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");

    }
}
