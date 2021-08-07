package cn.star.day05.demo02;

/**
 * @author xin5
 * @date 2021年08月04日 22:11:50
 */
public interface Animal {

    public abstract void run();

    public abstract void eat();

    public default void method() {
        System.out.println("这是默认方法");
    }

}
