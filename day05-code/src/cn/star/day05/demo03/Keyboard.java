package cn.star.day05.demo03;

/**
 * @author xin5
 * @date 2021年08月07日 14:45:15
 */
public class Keyboard implements Usb {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘打字");
    }
}
