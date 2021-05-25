package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:10
 * Topic:从键盘输入多个学生,某课程的成绩放到一个数组中,然后计算学生的平均分
 */
public class Ten {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double[] score;
        double sum = 0.0;
        System.out.println("请输入学生的个数: ");
        int cn = read.nextInt();
        score = new double[cn];

     for (int i = 0; i < score.length; i++) {
         System.out.println("请输入第"+(i+1)+"个学生的成绩");
         score[i] = read.nextDouble();
     }
        for (double v : score) {
            sum = sum + v;
        }
     System.out.println("学生的平均成绩: "+sum/score.length);

    }
}
