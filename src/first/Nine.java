package first;

import java.util.Scanner;


/**
 * @author wlm
 * Day:9
 * Potic: 输入一个数字判断反转后是否一样
 */
public class Nine {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("请输入整数: ");
        int unm = read.nextInt();
        String str = String.valueOf(unm);
        StringBuilder bstr = new StringBuilder();
        String nstr = bstr.toString();
        if (str.equals(nstr)) {
            System.out.println("反转一样.");
        } else {
            System.out.println("反转不一样.");
        }
    }
}
