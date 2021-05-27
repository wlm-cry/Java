package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 *
 */
public class PhoneThree {
    public static void main(String[] args) {
        Phone three = new Phone();
         System.out.println(three.brand);
         System.out.println(three.price);
         System.out.println(three.color);
         System.out.println(three.praise);
         System.out.println("这是没有赋值的情况下");
         System.out.println("现在我们来赋值，看看是什么情况");
         System.out.println("//////////////////////////////\n");

         three.brand = "黑莓";
         three.price = 56565.2;
         three.color = "黑色";
         three.praise = "这个手机就是有点贵，其他的是没有什么的";
        System.out.println(three.brand);
        System.out.println(three.price);
        System.out.println(three.color);
        System.out.println(three.praise);
        three.call("老婆");
        three.sendMessage();
        System.out.println("////////////////////////////////\n");

        // 将two中的值给three
        Phone two = three;
        // 这里好像是不可以直接写成 Phone two = three;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.praise);
        // 现在我们打印出来的就是two中的黑莓手机的内容
        System.out.println("/////////////////////////////////\n");

        two.brand = "三星";
        two.price = 4554;
        two.color = "白色";
        two.praise = "除了电池会爆炸，不得不说这手机还是可以的；";
        two.call("我老婆，这是我的老婆");
        two.sendMessage(); // 群发短信
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.praise);
    }
}
