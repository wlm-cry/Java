package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wlm
 * Day:
 * Potic:求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制;
 */
public class TwentyFive {
    public static void main(String[] args) throws IOException {
        int a = 0;
        String outPut = "";
        BufferedReader sta = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入A的值：");
        String inPut = sta.readLine();
        for (int i = 1; i <= Integer.parseInt(inPut); i++) {
            outPut += inPut;
            a = Integer.reverse(Integer.parseInt(outPut));
            a += a;
        }
        System.out.println(a);
    }
}

