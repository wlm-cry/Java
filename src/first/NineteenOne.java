package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:19
 * Potic:输入一个五位数，判断其是否为回文数
 */
public class NineteenOne {
    private static String n;
    private static String m;

    public static void main(String[] args) {
        System.out.println("Please enter the to be detected here: ");
        Scanner scan = new Scanner(System.in);
        int m= scan.nextInt();
        int number=m;
        int n=0;
        while(m>0) {
            n=n*10+m%10;
            m=m/10;
        }
        if(n==number) {
            System.out.println(number+"is a palindrome!");
        }
        else {
            System.out.println(number+"is not a palindrome!");
        }
    }
}
