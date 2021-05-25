package first;

import java.util.Scanner;

/**
 *@author wlm
 * Day:26
 * Potic:题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class TwentySix {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        // 创建一个数组
        Scanner read = new Scanner(System.in);
        int idxOne = 0, idxTwo = 0;
        System.out.println("请输入3个整数： ");
        for (int i = 0; i < n; i++) {
            a[i] = read.nextInt();
        }
        System.out.println("你输入的数组是： ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                idxTwo = i;
            }if (a[i] < min) {
                min = a[i];
                idxTwo = i;
            }
        }
        if (idxOne != 0) {
            int temp = a[0];
            a[0] = a[idxOne];
            a[idxTwo] = temp;
        }
        if (idxTwo != n - 1) {
            int temp = a[n - 1];
            a[n - 1] = a[idxTwo];
            a[idxTwo] = temp;
        }
        System.out.println("\n交换后的数组是： ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]+ " ");
        }
    }
}
