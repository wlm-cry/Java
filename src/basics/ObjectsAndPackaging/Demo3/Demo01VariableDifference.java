package basics.ObjectsAndPackaging.Demo3;

/**
 * @author wlm
 *
 * 《局部变量/成员变量》
 *
 * 1、定义的位置不一样
 *      局部变量：在方法的内部
 *      成员变量：在方法的外部，直接写在类中
 *
 * 2、作用范围不一样
 *      局部变量：只有方法中菜可以使用，方法之外是不可以使用的
 *      成员变量：整个类都是可以使用的
 *
 * 3、默认值不一样
 *      局部变量没有默认值的，如果要想使用，必须手动进行赋值
 *      成员变量如果是没有赋值的话，会有默认的值，规则和数组一样
 *
 * 4、内存的内置不一样
 *      局部变量位于栈内存
 *      成员变量位于堆内存
 *
 * 5、生命的周期不一样
 *      局部变量：随着方法进栈而诞生，随着方法出栈而消失
 *      成员变量：随着对象的创建而诞生，随着对象被垃圾回收而消失
 */
public class Demo01VariableDifference {
    String name;
    // 这是一个成员变量
    public void methodA() {
        int num = 20;
        // 局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param) {
        // 方法的参数就是局部变量
        // 参数在方法调用的时候，不然会被赋值的

        int age;
        // 局部变量
//        System.out.println(age);  注意，在这里如果是没有赋值的的时候
        // System.out.println(num);   不同的类，是不能胡乱调用的
        System.out.println(name);
    }
}
