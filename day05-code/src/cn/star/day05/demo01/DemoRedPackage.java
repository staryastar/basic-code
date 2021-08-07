package cn.star.day05.demo01;


import java.util.ArrayList;

/**
 * @author xin5
 * @date 2021年08月03日 23:51:13
 */
public class DemoRedPackage {
    public static void main(String[] args) {
        Manager manage = new Manager("管理员", 100);
        Member member1 = new Member("成员1", 0);
        Member member2 = new Member("成员2", 0);
        Member member3 = new Member("成员3", 0);
        manage.show();
        member1.show();
        member2.show();
        member3.show();

        System.out.println("==============");

        ArrayList<Integer> list = manage.send(20, 3);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        manage.show();
        member1.show();
        member2.show();
        member3.show();




    }
}
