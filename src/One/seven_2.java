package One;

public class seven_2 {
    // return
    public static void main(String[] args) {
        seven_2 t = new seven_2();
        t.test1();
        System.out.println(t.test2());
    }
    public void test1() {
        System.out.println("无返回值类型的return语句测试");
        for (int i = 1; ; i++) {
            if (i == 4) return;
            System.out.println("i =" + i);
        }
        // System.out.println("不可执行的, 不能访问的");
    }
    public String test2() {
        System.out.println("有返回值类型的return语句测试");
        return "返回一个字符串";
         // 有返回值的return值测试
         // @return string

    }

}
/*
题目: 简单理解return的作用

今天出现的错误:
    Java编译的时候出现:需要class,interface/enum--简单来说就是自己的class的大括号没有把方法括起来

    java需要(或者[; ---就是写错了
 */
