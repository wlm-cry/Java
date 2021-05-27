package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 */
public class PhoneOneSix {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.praise);
    }

    private static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "小米";
        one.price = 3486;
        one.color = "蓝色";
        one.praise = "这是我一直信赖的品牌";
        return one;
        // 这里为什么需要写和返回语句？
    }
}
