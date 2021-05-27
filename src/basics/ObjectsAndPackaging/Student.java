package basics.ObjectsAndPackaging;

/**
 * @author wlm
 * 定义一个类，用来模拟“学生”的生活。其中有最基础的2个部分组成；
 * 属性（是什么）
 *      姓名
 *      年龄
 * 行为（能做什么）
 *      吃饭
 *      睡觉
 *      学习
 *
 * 一对应到Java类中，就是
 * 成员变量（属性）：
 *      String name（姓名）
 *      int age
 * 成员方法（行为）：
 *      public void eat;
 *      public void sleep();
 *      public void study();
 *
 * 注意：
 *      成员变量是直接定义在类中的，在方法的外边
 *      成员方法不要直接写static关键字？这是为什么？
 */
public class Student {
    String name;
    int age;

    public void eat() {
        System.out.println("在吃饭");
    }
    public void sleep() {
        System.out.println("在睡觉");
    }

    void study() {
        System.out.println("在学习");
    }

    public void name() {
    }

    public void age() {
    }
}
