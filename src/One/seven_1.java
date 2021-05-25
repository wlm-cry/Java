package One;

import java.util.Scanner;

public class seven_1 {
    public static void main(String[] args){
        // continue
        Scanner read=new Scanner(System.in);
        int count=0;
        for(int i=1;i<=20;i++){
            System.out.println("请输入第"+i+"同学的成绩: ");
            int sore=read.nextInt();
            if(sore<80){
                continue;
            }
            count++;
        }
        System.out.println("80以上的人数: "+count);
    }
}
/*
循环输入20个人的成绩,统计大于80分的人数有多少个人
    需要定义变量count记录大于80分的人(包括等于80分的),每次循环一次,都是需要判断是否等于80,如果是就执行count+1
    不是的话就会执行continue,跳过本次循环, 继续下次循环
 */
