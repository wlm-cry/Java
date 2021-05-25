package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:19
 * Potic:输入一个五位数，判断其是否为回文数
 * 回文数：将其数字反向排列的数与其本身相同。如12321,14541是回文数
 *
 * 这个程序是有问题的，具体是什么问题？明天再搞好了
 *
 */
public class Nineteen {
    public static void main(String[] args) {
        System.out.println("Please enter the to be detected here: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int num = n;
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num /10;
        num = num /10;
        int d = num % 10;
        num = num / 10;
        int e = num % 10;
        if (a == e && b == d) {
            System.out.println(n+"This is a palindrome!");
        } else {
            System.out.println(n+"This is not a palindrome");
        }
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[arr.length - 1 - i]) {
                continue;
            } else {
                res = false;
            }
        }
        if(res) {
            System.out.println(n+"This is a palindrome");
        } else {
            System.out.println(n+"This is not a palindrome");
        }

    }
}
