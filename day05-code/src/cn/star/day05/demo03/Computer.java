package cn.star.day05.demo03;

/**
 * @author xin5
 * @date 2021年08月07日 14:40:24
 */
public class Computer {

    public void powerOn() {
        System.out.println("打开电脑");
    }

    public void useDevice(Usb usb) {
        usb.open();


        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        usb.close();
    }

    public void powerOff() {
        System.out.println("关闭电脑");
    }
}
