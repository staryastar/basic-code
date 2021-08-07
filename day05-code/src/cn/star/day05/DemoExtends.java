package cn.star.day05;

/**
 * @author xin5
 * @date 2021年08月02日 21:45:57
 */
public class DemoExtends {
    public static void main(String[] args) {
        Father father = new Father();
        father.name = "小头爸爸";
        father.age = 34;

        Son son = new Son();
        son.name = "大头儿子";
        son.age = 5;

        son.sleep();


    }
}


class Father {
    String name;
    int age;

    public Father() {

    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Father is sleeping!");
    }
}

class Son extends Father {
    String name;
    int age;

    public Son() {}

    public Son(String name, int age) {
        super("1111",20);
        this.name = name;
        this.age = age;

    }


    public void play() {
        System.out.println("Son is play");
    }

    @Override
    public void sleep() {
        System.out.println("Son is sleeping");
    }
}