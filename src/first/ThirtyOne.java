package first;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wlm
 * Day:31
 * Topic:给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度
 */
public class ThirtyOne {
    static int newNum = 0;
    static int oldNum = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的字符串");
        String s = sc.nextLine();
        fun2(s);
    }
    private static void fun2(String s) {
        if (s.length()==0){
            oldNum = 0;
        }else {
            for (int j = 0; j < s.length(); j++) {
                ArrayList<Character> strings = new ArrayList<>();
                for (int i = j; i < s.length(); i++) {
                    if (!strings.contains(s.charAt(i))) {
                        strings.add(s.charAt(i));
                        newNum = strings.size();
                    } else {
                        break;
                    }
                    if (oldNum <= newNum) {
                        oldNum = newNum;
                    }
                }
            }
        }
        System.out.println("最大的字串字符长度是："+oldNum);
    }
}

