package basics.ObjectsAndPackaging.Demo3;

/**
 * @author wlm
 */
public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("wlm");
        stu.setAge(44);
        stu.setMan(true);
        System.out.println("姓名"+stu.getName());
        System.out.println("年龄"+stu.getAge());
        System.out.println("是不是男的？"+stu.getMan());
    }
}
