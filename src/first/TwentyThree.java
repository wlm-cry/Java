package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:23
 * Potic:求一个3*3矩阵对角线元素之和。
 */
public class TwentyThree {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] [] a = new int[9][9];
        System.out.println("请输入9个整数： ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = read.nextInt();
            }
        }
        System.out.println("输入的3*3的矩阵是： ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                        sum += a[i][j];
                } 
            }
        }
        System.out.println("对角线之和是：" + sum);
    }
}
