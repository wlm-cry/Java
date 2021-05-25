package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:12
 * Potic:从键盘输入一个3*3的二维数组并翻转;效果如下
 * 1 2 3
 * 4 5 6
 * 7 8 9

 * 1 4 7
 * 2 5 8
 * 3 6 9
 */
public class Twelve {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("请输入第"+(i+1)+"行"+"第"+(j+1)+"列");
                a[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j] +" ");
            }
            System.out.println("\n");
        }
    }
}



