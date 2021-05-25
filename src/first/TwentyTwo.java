package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:22
 * Potic:当用户输入两个 double 类型的数值后需要计算这两个数值之和，而这两个操作数是可以变动的，
 * 但是求和的功能是不变的，这时就需要定义一个方法，只要在需要求和时调用该方法即可，该方法将计算之后的结果返回。
 */
public class TwentyTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("请输入操作数1：");
        double numOne = read.nextDouble();
        System.out.println("请输入操作数2：");
        double numTwo = read.nextDouble();
        double d = sum(numOne + numTwo);
        System.out.println(numOne +"+"+numTwo+"="+ d);
    }

    private static double sum(double v) {
        return v;
    }

    public static double sum(double i, double j) {
        double sum = i + j;
        return 0;
    }
}
