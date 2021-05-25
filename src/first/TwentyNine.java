package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:29
 * Potic:三目运算符：利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90 分的同学用 A 表示，60-89 分之间的用 B 表示，60 分以下的用 C 表示。
 */
public class TwentyNine {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner read = new Scanner(System.in);
        int input = read.nextInt();
        String result = input >= 90 ? "A" : ((input >= 60 && input < 90) ? "B" : "C");
        System.out.println(result);
    }
}
