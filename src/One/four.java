package One;

import java.util.Scanner;

public class four {
    public static void main(String[] args){
        int number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();
        if(number/10000==0){
            System.out.print("这是一个五位数");
        }else if(number/1000==0){
            System.out.print("这是一个四位数");
        }else if(number/100==0){
            System.out.print("这是一个三位数");
        }else if(number/10==0){
            System.out.print("这是一个二位数");
        }else  if(number/10==0&number>0){
            System.out.print("这是一个一位数");
        }else {
            System.out.print("请输入一个整数(0/99999)");
        }

    }
}

/*
if(number ==1)----之前我是写成 if(number/1==1) 然后是系统自动帮我解决了;
java需要class,interface或者是enum, 这个是什么错误?
Connected to the target VM, address: '127.0.0.1:5793', transport: 'socket'
??? 今天的问题是出现if 判断不能运行
 */

// 之前的代码是==1, 但是在群里面更正了之后变得真的是更好;






