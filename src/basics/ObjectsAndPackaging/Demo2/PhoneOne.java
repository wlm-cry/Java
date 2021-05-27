package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 * 根据phone类，创建一个PhoneOne的对象
 * 类名称 对象名 = new 类名称();
 */
public class PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println(one.praise);
        System.out.println("这是我在main函数中设置好的默认的值，好作为对比");

        one.brand = "华为";
        one.color = "黑色";
        one.price = Double.parseDouble("454545.1");
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println(one.praise);
        System.out.println("这是重新赋值的内容，与之前的作对比！");

        one.call("拜登");
        // 给谁谁打电话
        one.sendMessage();
        // 群发短信
    }
}
