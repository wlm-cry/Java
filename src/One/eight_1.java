package One;

import java.util.Scanner;

/**
 * @author wlm
 */
public class eight_1 {
    public static void main(String[] args){
        int upper = 0;
        int lower = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                upper += 1;
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                lower += 1;
            }else if(s.charAt(i) >= '0' && s.charAt(i) >= '9'){
                number += 1;
            }

        }
        System.out.println("大写字母字符的次数： "+upper);
        System.out.println("小写字母字符的次数； "+lower);
        System.out.println("数字字符的次数； "+number);
    }
}
/*
    题目: 键盘输入一个字符串, 统计字符串中的大小写字母与数字字符出现的字数, 各个数值的初始值为0;
 */


/*

 */