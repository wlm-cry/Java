package basics;

/**
 * @author wlm
 * ++和--的运算规程
 * 任何的
 */
public class DataType {
    public static void main(String[] args) {
        int a = 1;
        int b = ++a;
        System.out.println("++a的运算规程是"+a);
        System.out.println("++a的运算规程是"+b);
        /*
        变量a自己加1，将加1后的结果赋值给b，也就是说a先计算
        这就是前++的用法
            运算结果
         ++a的运算规程是2
         ++a的运算规程是2
         */

        int c = 1;
        int d = c++;
        System.out.println("C++的运算规程是： "+c);
        System.out.println("C++的运算规程是： "+d);
        /*
        变量c先把自己的值1，赋值给变量d，此时变量d的值就是1，变量c自己再加1
            运算结果
        C++的运算规程是： 2
        C++的运算规程是： 1
         */

        int aa = 1;
        int bb = aa--;
        System.out.println("aa--的运算规程是： "+bb);
        System.out.println("aa--的运算规程是： "+aa);
        /*
        aa--的运算规程是： 1
        aa--的运算规程是： 0
            也就是说，bb先是等于aa然后减一；得到的是bb是1
            aa-1就是0了
         */

        int cc = 1;
        int dd = --cc;
        System.out.println("--cc的运算规程是："+dd);
        System.out.println("--cc的运算规程是："+cc);
        /*
        --cc的运算规程是0
        --cc的运算规程是0
        先是减一，然后就是把值赋值给bb，因为是最先cc的值减了1.所以cc也是1
         */

    }
}
