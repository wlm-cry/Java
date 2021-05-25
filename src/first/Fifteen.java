package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:15
 * Potic:有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
 */
public class Fifteen {
    public static void main(String[] args) {
        int[] arr = new int[] {111, 222, 333, 444, 555, 666, 777, 888, 999};
        System.out.println("please enter the number to be inserted: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int i = 0; i < arr.length-2; i++) {
            if (num >= arr[i] && num <= arr[i+1] ) {
                for (int j = arr.length-1; j > i+1; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = num;
                break;
            }
        }
        System.out.println("Insert number("+num+"):the array after the is.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}

