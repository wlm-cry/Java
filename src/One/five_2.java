package One;

import java.util.Scanner;

public class five_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a week");
        int w = sc.nextInt();

        switch(w) {
            case 1:
            case 2:
            case 3:
                System.out.println("frank--vim大法好");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("星期六");
                System.out.println("学习frank--Java");
                break;
            case 7:
                System.out.println("星期日");
                System.out.println("总结笔记/看笔记");
                break;
            default:
                System.out.println("输入错误, 下周重来");
        }
    }
}
