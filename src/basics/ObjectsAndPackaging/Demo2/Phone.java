package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 * 定义一个类，用模拟“手机”的功能
 * 属性：品牌、价格、颜色、好评怎么样
 * 行为：打电话、发短信、看电影、玩游戏...
 *
 * 对应到类中就是：
 * 1、成员变量（属性）
 *  String brand; 品牌
 *  double price; 价格
 *  String color; 颜色
 *  String Praise；好评多不多，具体的评价怎么样
 *
 *
 */
public class Phone {
    String brand;
    double price;
    String color;
    String praise;
    // 这些是成员变量

    public void call(String who) {
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage() {
        System.out.println("群发消息");
    }
    public void brand() {
        System.out.println("苹果");
    }
    public void price() {
        System.out.println(79000);
    }
    public void color() {
        System.out.println("有红、黑、白、金等多种颜色选择");
    }
    public void praise() {
        System.out.println("这真的是太好用了啊");
    }
}
