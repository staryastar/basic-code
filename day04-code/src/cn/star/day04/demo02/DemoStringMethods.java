package cn.star.day04.demo02;

import java.util.Arrays;

/**
 * @author xin5
 * @date 2021年07月31日 19:59:36
 */
public class DemoStringMethods {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("str1: " + str1);

        byte[] byteArray = {97, 98, 99};
        String str2 = new String(byteArray);
        System.out.println("str2: " + str2);

        char[] charArray = {'A', 'B', 'C'};
        String str3 = new String(charArray);
        System.out.println("str3: " + str3);

        String str4 = "aaaaaaa";
        System.out.println("str4: " + str4);


        System.out.println("=============");

        String str5 = "ABCD";
        System.out.println("str5的长度： " + str5.length());
        System.out.println(str5.charAt(2));
        System.out.println(str5.indexOf("B"));
        System.out.println(str5.substring(2));
        System.out.println(str5.substring(1, 3));

        String str6 = "ABCD";
        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));

        char[] charArray1 = {'A', 'B', 'C', 'D'};
        String str7 = new String(charArray1);

        System.out.println(str5 == str7);
        System.out.println(str5.equals(str7));

        String str8 = "abcd";
        System.out.println(str5.equalsIgnoreCase(str8));

        System.out.println(str8.replace("a", "*"));

        System.out.println(Arrays.toString(str8.split("c")));


    }


}
