package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:14
 * Potic:输入2个正整数M和N,求其最大公约数和最小公倍数
 */
public class Fourteen {
    public static void main(String[] args) {
        int greatestCommonDivisor = 0;
        int leastCommonMultiple = 0;
        System.out.println("please enter 2 whole numbers: ");
        Scanner read = new Scanner(System.in);
        int input1 = read.nextInt();
        int input2 = read.nextInt();
        leastCommonMultiple = input1*input2;
        int temp = 1;

        if (input2 > input1) {
            temp = input1;
            input1 = input2;
            input2 = temp;
        }
        while (temp != 0) {
            temp = input1%input2;
            input1 = input2;
            input2 = temp;
        }
        greatestCommonDivisor = input1;
        leastCommonMultiple = leastCommonMultiple/greatestCommonDivisor;
        System.out.println("The greatest common divisor is: "+greatestCommonDivisor);
        System.out.println("The least common multiple is: "+leastCommonMultiple);
        read.close();
    }
}
