package cn.star.day04.demo01;

import java.util.ArrayList;

/**
 * @author xin5
 * @date 2021年07月28日 23:17:26
 */
public class DemoStudentArrayList {

    public static void main(String[] args) {

        Student student1 = new Student("张三", 1);
        Student student2 = new Student("李四", 2);
        Student student3 = new Student("王五",3);
        Student student4 = new Student("赵四",4);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student4);
        list.add(student3);
        list.add(student2);
        list.add(student1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + list.get(i).getNum());
        }


    }

}
