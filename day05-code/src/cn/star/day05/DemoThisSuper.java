package cn.star.day05;

/**
 * @author xin5
 * @date 2021年08月03日 21:45:48
 */
public class DemoThisSuper {
    public static void main(String[] args) {

        Dog dog = new Dog("小白");
        Animal animal = new Animal("动物们");

        dog.wang();
    }
}


class Animal {

    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void playing() {
        System.out.println("Animal is Playing");

    }
}


class Dog extends Animal{

    String name;
    int age;

    public Dog() {
        super();
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this("aaa");
        this.age = age;
    }

    @Override
    public void playing(){
        System.out.println("Dog is playing");
    }

    public void wang() {
        System.out.println("Dog is Wang Wang Wang");
        System.out.println(this.name);
        System.out.println(super.name);
        super.playing();
    }


}

