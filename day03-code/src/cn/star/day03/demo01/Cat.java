package cn.star.day03.demo01;

/**
 * @author xin5
 * @date 2021年07月25日 10:38:02
 */
public class Cat {
    private String name;
    private String color;
    private String brand;
    private int weight;
    private boolean male;


    public void sleep(){
        System.out.println("睡觉觉");
    }

    public void eat(){
        System.out.println("吃饭饭");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
