package first;

import java.util.Scanner;

/**
 * @author wlm
 * Day:13
 * Potic:用java编写一个简单的字符串加密解密程序，将字符串分成若干行，实现字符串以一列一列读取，并还原之前输入的字符串。
 * 这里实现4行输出。
 */
public class Thirteen {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = null;
        System.out.println("Please enter the string you want to enter: ");
        str = read.nextLine();
        int nStr = str.length();
        char[] aStr = new char[nStr];
        aStr = str.toCharArray();
        char[][] encryption = new char[4][nStr];
        encryption[0][0] = '3';
        for (int i = 0; i < 4; i++) {
            for (int j = 0, k = i - 1; j < nStr && k < nStr ; j++, k+=3) {
                encryption[i][j] = aStr[k];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < nStr; j++) {
                System.out.println(encryption[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < nStr; j++) {
                System.out.print(encryption[i][j]);
            }
        }
        char[] bStr = new char[nStr];
        int k = 0;
        for (int m = 0; m < nStr; m++) {
            for (int n = 1; n < 4 && k < nStr; n++) {
                bStr[k++] = encryption[n][m];
            }
        }
        System.out.println();
        for (int i = 0; i < nStr; i++) {
            System.out.print(bStr[i]);
        }
    }
}

