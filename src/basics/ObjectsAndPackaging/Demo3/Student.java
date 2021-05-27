package basics.ObjectsAndPackaging.Demo3;

/**
 * @author wlm
 * 对于基本类型中的boolean值，Getter方法一定要写成isXXX形式，而setXxxx格式不变
 *
 */
public class Student {
    // 为什么时间是写在这里？
    private String name;
    private double age;
    private boolean man;

    public void setMan(boolean b){
        man = b;
    }
    public void setAge(double d) {
        age = d;
    }
    void setName(String str) {
        name = str;
    }
    public String getName() {
        return name;
    }
    public double getAge() {
        return age;
    }
    public boolean getMan() {
        return man;
    }
}
