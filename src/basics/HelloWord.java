package basics;

/**
 * @author wlm
 * Day:1
 * Java语言的第一行代码
 */

public class HelloWord {
    /*
    // 第一行的第三个单词必须和所在的文件名称完全一样，大小写也要一样
    // public class后面代表定义一个类的名称，类是Java当中所有源代码的基本组织单位。
    */
    /*
    // 第二行的内容是万年不变的固定写法，代表main方法
    // 这一行代表程序执行的起点
     */

    public static void main(String[] args) {
        // 第三行代表打印输出语句（其实就是屏幕显示）
        // 希望显示什么东西，就在小括号当中填写什么内容
        //System.out.println("hello Java world！");
        // 打印各种类型的常量
       // System.out.println(123);
        //System.out.println(0.23);
        //System.out.println('a');
      //  System.out.println('A');
      //  System.out.println("你好，Java世界");

        int b = 3;
        char c = 7;
        // int sum = b + c;;
        System.out.println(b+c);
    }
}

/*
1. 编写代码
2. 编译
3. 运行

初学者会遇到的问题，首先是拼写错误；
当出现错误的时候，在idea中一般波浪线的都是错的地方，自己需要注意啊；
在编写代码过程中，如果是很喜欢把字符换成中文的话，那就在输入法中设置在任何时候输出英文字符就好；

public:访问修饰符
static:关键字
void:返回类型
main:方法名
String:String类
args:字符串数组
 */
