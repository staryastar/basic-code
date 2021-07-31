package cn.star.day04.demo01;

/**
 * @author xin5
 * @date 2021年07月28日 23:15:01
 */
public class Student {
    private String name;
    private int num;


    public Student() {
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
