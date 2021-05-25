package basics;

/**
 * @author wlm
 * Day:1
 * 四类八种基本数据类型（type of data）
 * 注意：Java中，整数默认int，浮点类型是double
 * 格式--数据类型 变量名 = 数据值
 * 输出各种变量--熟悉各种变量的名称
 */
public class TypeOfData {
    public static void main(String[] args) {
        // 字节型
        byte b = 0;
        // 短整型
        short s = 1000;
        // 定义整型
        int i = 123456;
        // 定义长整型
        long l = 1234567888L;
        // 定义单精度浮点型
        float f = 5.5F;
        // 定义双精度浮点型
        double d = 8.5;
        // 定义布尔类型
        boolean bool = false;
        // 定义字符串
        char c = 'A';
        // 直接输出上面的赋值
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        // 如果在里面直接打印上bool的话，就报错，具体原因的话不知道
        System.out.println(false);
        System.out.println(c);
    }
}
