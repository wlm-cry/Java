package One;
import java.util.Scanner;
public class three {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2个数: ");
        int num_a, num_b, max;
        Scanner read = new Scanner(System.in);
        num_a = read.nextInt();
        num_b = read.nextInt();
        if(num_a > num_b){
            max = num_a;
        }else {
            max = num_b;
        }
        System.out.println("最大值是" +max);
    }
}
/*
注意: 变量名的话是用小驼峰命名法命名的, 不是用这个, 这个一般是用来使用C语言用的;
    虽然自己的C语言是没有看
 */




