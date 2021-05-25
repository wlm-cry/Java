package first;

import java.util.Scanner;

/**
 * @author wlm
 * Potic: 1-对用户输入的每个字符的值进行加密,然后输出
 *        2-对用户输入的已经加密的字符串进行解密并输出
 */
public class ElevenTwo {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = null;
        System.out.println("请输入您想输入的字符串：");
        str = sc.nextLine();
        int nStr = str.length();
        char[] elevenTwo = new char[nStr];
        elevenTwo = str.toCharArray();
        char[][] array = new char[4][nStr];

        array[0][0] = '3';
        for (int i = 1; i < 4; i++){
            for (int j = 0, k = i - 1; j <nStr && k < nStr ; j++, k+=3){
                array[i][j] = elevenTwo[k];
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < nStr; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < nStr; j++){
                System.out.print(array[i][j]);
            }
        }
        char[] bStr = new char[nStr];
        int k  = 0;
        for (int m = 0; m < nStr; m++){
            for (int n = 1; n < 4 && k < nStr; n++){
                bStr[k++] = array[n][m];
            }
        }
        System.out.println();
        for (int i = 0; i < nStr; i++){
            System.out.print(bStr[i]);
        }
    }
}
