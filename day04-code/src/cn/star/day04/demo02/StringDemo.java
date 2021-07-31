package cn.star.day04.demo02;

/**
 * @author xin5
 * @date 2021年07月31日 20:39:41
 */
public class StringDemo {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};
        System.out.println(stringFromArr(intArr));
    }

    public static String stringFromArr(int[] intArr) {
        String result = "[";
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                result += "word" + intArr[i] + "]";
                break;
            }
            result += "word" + intArr[i] + "#";
        }
        return result;
    }
}
