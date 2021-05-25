package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:18
 * Potic:简易计算器（只需要考虑加减乘除）
 */
public class EighteenOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        System.out.println("please enter: ");
        int operandOne = input.nextInt();
        String operator = input.next();
        int operandTwo = input.nextInt();
        input.close();
        switch (operator) {
            case "+":
                result = operandOne -operandTwo;
                break;
            case "-":
                result = operandOne - operandTwo;
                break;
            case "*":
                result = operandOne * operandTwo;
                break;
            case "/":
                result = operandOne / operandTwo;
                break;
            default:
                break;
        }
        System.out.println("result"+result);
    }
}
/*
这是为啥呢？
明明都是可以运行的，但是就是画波浪线
 */