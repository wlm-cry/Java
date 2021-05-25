package frank135;

import java.util.Scanner;

public class four_f {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请数输入需要判断的数字：");
        int a = sc.nextInt();
        if(a>0&&a<=99999)
            System.out.println("这是"+determine(a)+"位数");
    }

    private static int determine(int a) {
        int s=1;
        int n=a/10;
        while (n>0){
            s++;
            n/=10;
        }
        return s;
    }
}
