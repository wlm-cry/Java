package basics;

import java.util.Arrays;

/**
 * @author wlm
 * 面向对象的过程：
 *      当需要的时候实现那个功能的时候，每一个具体步骤都是亲力亲为，详细到每一个细节
 * 面向对象的过程：
 *      当需要实现某个功能的时候，不关心具体的步骤，而是找一个已经具有该能能力的人，来帮我自己做事情；
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] arry = {10, 20 ,30, 40, 50, 60, 70};
        // 要求打印[10, 20, 30, 40, 50]
        // 是有面向过程，每一个步骤都是亲力亲为。
        System.out.print("[");
        for (int i = 0; i < arry.length; i++) {
            if(i == arry.length - 1) {
                // 如果是最后一个元素
                System.out.print("]");
            } else {
                // 如果不是最后一个元素
                System.out.print(arry[i] + ", ");
            }
        }
        System.out.println();
        // 使用面向对象
        // 找JDK中给我们提供好的方案，直接是可以把数组编程我们自己想要的字符串
        // 其中已经是有一个Arrays类，其中有个toString方法，直接是把想要的数组变成字符串
        System.out.println(Arrays.toString(arry));
    }
}
