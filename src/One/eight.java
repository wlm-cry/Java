package One;

import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        String Name = "wlm";
        String passWord = "123456";
        for (int i = 3; i > 0; i--) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名" );
            String userName = String.valueOf(sc.nextInt());
            System.out.println("请输入密码: ");
            String userPwd = String.valueOf(sc.nextInt());
            if(userName.equals(Name) && userName.equals(passWord)){
                System.out.println("登录成功!!");
                break;
            }else{
                System.out.println("用户名或密码输入错误! 你还有"+(i-1)+"次机会");
                if(i - 1 == 0){
                    System.out.println("您的账户已经锁定, 请与管理员联系进行解封!!");
                }
            }
        }
    }
}
/*
    题目:实现一个用户登录(String); 用户输入正确的用户名以及密码, 即可登录成功;
        否则重新输入, 三次过后输出锁定用户;
 */

// 变量名方法名用小驼峰
// 类名是大驼峰
