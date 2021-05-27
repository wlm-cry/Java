package basics.ObjectsAndPackaging;

/**
 * @author wlm
 *
 */

/*
在通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1、导包
    也就是指出需要使用的类，在什么位置
    import 包名称、类名称
    import xx -- 就是导入什么包
    对于当前类属于一个包的情况下是可以直接用的，可以省略导入包的语句
    对于不是同一个类的，就是需要导入包语句，通常来idea会智能的导入工具

2、创建  --- 格式
    类名称 对象名 = new 类名称();
    Student stu = new Student();

3、使用，是分成2种情况
    使用成员变量：对象名.成员变量名
    使用成员方法：对象名.成员方法名(参数);
    （想用谁就调用谁）

注意事项：
    如果成员变量没有进行赋值，那么就会有一个默认值，规则是和数组一样

 */


public class One {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("这个时候，名字是空null，年龄是0，因为我没有给他赋值");

        // 改变对象当中的成员变量数值内容
        // 将右侧的字符串赋值交给stu对象中的name成员变量
        stu.age = 19;
        stu.name = "wlm";
        System.out.println(stu.name);
        System.out.println(stu.age);
        // 这个时候就是把我们自己想要的值赋值到成员变量中了；


        // 使用对象成员的方法也是很简单的，直接就是对象.成员方法名
        stu.name();
        stu.age();
        stu.study();
    }
}
