package basics.ObjectsAndPackaging.Demo3;

/**
 * @author wlm
 * 问题:定义person的年龄的时候，无法阻止不合理的数值被设置进来；
 *
 * 解决：用private进行修饰，那么本类当中任然可以随意访问，但是超出本类之外我们就不能直接保证了；
 *
 * 见解访问private成员变量，那么就定义一对Getter/Setter方法
 *
 * 必须是 Getter或者是getXxx命名规则
 *对于Getter来说，不能有参数，返回值类型和成员变量
 *对于Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Person {
    String name;
    // 名字
    private int age;
    // 年龄
    public void show() {
        System.out.println("我叫:"+name+",年龄："+age);
    }
    // 成员方法，专门向age设置数据
    public void setAge(int num) {
        if (num < 100 && num >= 9) {
            age = num;
            // 如果这是合理的情况
        } else {
            System.out.println("数据不合理！！！");
        }
    }
    // 这个成员方法，专门私语获取age数据
    public int getAge() {
        return age;
    }
}
