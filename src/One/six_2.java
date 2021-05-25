package One;

public class six_2 {
    public static void main(String[] args){
        // 打印5的阶乘, 用do....while实现
        int S1 = 1;
        int K = 1;
        do{
            S1=S1*K;
            K++;
        }while (K<=5);
        System.out.println("5的阶乘是： "+S1);

    }
}
