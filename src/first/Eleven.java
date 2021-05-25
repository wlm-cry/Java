package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:11
 * Topic:输入一串字符串之后,加密输出;然后再解密输出.
 */
public class Eleven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = read.next();
        String bstr = new StringBuffer(str).reverse().toString();
        String nstr = " ";

        for (int i = 0; i < str.length(); i++) {
            nstr = nstr+(char)(str.charAt(i)+bstr.charAt(i));
        }
        System.out.println("密文"+nstr);
        String n = " ";
        for (int i = 0; i < nstr.length(); i++) {
            n = n+(char)+(nstr.charAt(i)-bstr.charAt(i));
        }
        System.out.println("还原密文"+n);
    }
}

