package One;

public class six_3 {
    public static void main(String[] args){
        // 加点点点难度：用for循环把5--100的阶乘打印出来
        for(int i=5; i<=100; i++){
            int S=1;
            for(int J=1; J<=i; J++){
                S=S*J;
            }
            System.out.println(i+"5到100的阶乘是： "+S);
        }
    }
}
