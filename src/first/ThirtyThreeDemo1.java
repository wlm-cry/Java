package first;

/**
 * @author wlm
 * Day:33
 * Topic:有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class ThirtyThreeDemo1 {
    public static void main(String[] args) {
        int a = 2, b = 1, t;
        double sum = 0;
        for (int i = 0; i <= 20 ; i++) {
            sum = sum +(double)a/b;
            t = a;
            b = a;
            a = b + t;
        }
        System.out.println("前20项相加之和是："+sum);
    }
}
