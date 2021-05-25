package One;

import java.util.Scanner;

public class five_1 {
    public static void main(String[] args){
        System.out.println("请输入本周第几天");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        switch (w){

            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}

// 输入一个整数，提示你输入的是星期几
/*
switch-case
    switch(表达式){
        case 值1: 语句1;
        case 值2：语句2;
        case 值3：语句3;
        ...
        default: 其他语句;

关键字：break
用于跳出switch所控制的语句块。
switch表达式会挨个和case后面的值对比，
如果表达式的值值1，从语句1开始执行。
如果表达式的值值2，从语句2开始执行。
...

否则，执行其他语句。
如果遇到break，则直接退出switch语句块。
}
 */