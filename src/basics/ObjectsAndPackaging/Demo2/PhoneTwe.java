package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 */
public class PhoneTwe {
    public static void main(String[] arg) {
        Phone tew = new Phone();
        System.out.println(tew.brand);
        System.out.println(tew.price);
        System.out.println(tew.color);
        System.out.println(tew.praise);

        tew.call("wlm");
        tew.sendMessage();
        // 上面都是空的值，下面我们自己给他们赋值

        tew.brand = "一加手机";
        tew.price = 89989.35;
        tew.color = "蓝色";
        tew.praise = "这是一款比较亲民的手机";
        System.out.println(tew.brand);
        System.out.println(tew.price);
        System.out.println(tew.color);
        System.out.println(tew.praise);

        tew.call("给班主任打电话，有事情找你喝茶！！！");
        tew.sendMessage();


    }
}
