package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:33
 * Topic:求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class ThirtyThree {
    public static void main(String[] args) {
        long a, b = 0;
        int sum = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("请输入A的值：");
        a = read.nextInt();
        System.out.println("请输入相加的项数：");
        int n = read.nextInt();
        int i = 0;
        while (i < n) {
            b = b + a;
            sum = (int) (sum + b);
            a = a * 10;
            ++i;
        }
        System.out.println(sum);
    }
}
