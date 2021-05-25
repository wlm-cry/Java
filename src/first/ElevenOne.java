package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:11
 * Potic: 1-对用户输入的每个字符的值进行加密,然后解密字符串输出
 *        2-对用户输入的已经加密的字符串进行解密并输出
 */
public class ElevenOne {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("请输入一个英文字符串: ");
        String pass = inout.nextLine();
        char[] c = pass.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char)(c[i]^200000);
        }
        System.out.println("加密或解密结果是: "+new String(c));
    }
}
/*
我们需要把加密的结果复制一遍然后再运行程序, 是很烦人的; 想想怎么优化...
 */
