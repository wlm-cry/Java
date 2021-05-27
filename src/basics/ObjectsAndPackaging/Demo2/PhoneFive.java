package basics.ObjectsAndPackaging.Demo2;

/**
 * @author wlm
 * 对象和封装，
 */
public class PhoneFive {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "小米";
        one.color = "白色";
        one.price =  347367;
        one.praise = "这是一款性价比比较好的手机";

        // 传递进去的参数其实就是地址值
        method(one);
    }

    private static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
        System.out.println(param.praise);
    }
}


/*
    注意19行，这是不理解的地方；在构建类的时候，名字是有什么区别的吗？
 */
