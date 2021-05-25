package first;

/**
 * @author wlm
 * Day:20
 * Potic:规范输出9*9乘法表
 */
public class Twenty {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.println(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
