package cn.star.day05.demo03;

/**
 * @author xin5
 * @date 2021年08月07日 14:43:06
 */
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
