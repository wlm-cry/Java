package One;

public class six_1 {
    public static void main(String[] args){
        // 打印5的阶乘, 用while语句实现该功能
        int S1= 1;
        int J = 1;
        while(J<=5){
            S1=S1*J;
            J++;
        }System.out.println("5的阶乘是: "+S1);
    }
}
// 之前的问题出在哪里？ 为什么我变量名换了之后他就是正常的了？这是溢出的表现吗？