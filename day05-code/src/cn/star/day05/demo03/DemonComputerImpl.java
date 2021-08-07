package cn.star.day05.demo03;

/**
 * @author xin5
 * @date 2021年08月07日 14:52:57
 */
public class DemonComputerImpl {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        computer.useDevice(new Keyboard());
        computer.useDevice(new Mouse());

        computer.powerOff();
    }
}
