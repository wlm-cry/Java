package One;

import java.util.Scanner;

public class four_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要判断的数字：");
        int a=sc.nextInt();
        if(a>0&&a<=99999)
            System.out.println("这是"+determine(a)+"位数");
        else
            System.out.println("输入错误！请输入0~99999之间的数字！");
    }
    public static int determine(int a){
        int s=1;
        int n=a/10;
        while (n>0){
            s++;
            n/=10;
        }
        return s;
    }

}
/**
 * 此代码完善的更好,以后就是使用这个代码就好了
 */
