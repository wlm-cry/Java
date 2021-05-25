package One;

import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        // 终止语句
        int PWD = 123456;
        Scanner read = new Scanner(System.in);
        int I = 0;
        int ALLMONEY = 1000;   // 自己给个默认的值
        for(;;){
            System.out.println("请输入密码");
            int P = read.nextInt();
            if(PWD!=P){
                I++;
                if(I==3){
                    System.out.println("输入密码三次错误！！！");
                    break;
                }else{
                    System.out.println("你输入第"+I+"次密码错误");
                }
            }else {
                System.out.println("请输入要取ide金额： ");
                int MONEY = read.nextInt();
            System.out.println("您的账户余额还有： "+(ALLMONEY-MONEY));
            break;
            }
        }

    }
}
/*
目标： 理解break/continue/return的区别
    设计一段程序， 可以输入三次密码，如果三次都错误的情况下做出提示 结束程序
    如果密码是对的，就输出自己要取出的金额，然后输出账户还剩下多少的金额

    break:
        终止循环/跳出循环/程序继续执行下面的语句
    continue:
        终止当次循环,跳到下一轮的循环
    return:
        把方法计算出来的东西返回给调用者
 */

