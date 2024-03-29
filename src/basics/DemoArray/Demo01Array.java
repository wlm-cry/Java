package basics.DemoArray;

/**
 * @author wlm
 * 本节是数组的相关概念
 * <p>
 * 什么是数组？数组是一种容器，可以同时存放多个数据的值
 * <p>
 * 数据的特点：
 * 1、数组是一种引用数据类型
 * 2、数组当中的多个数据，类型必须统一
 * 3、数组的长度在程序运行期间不可改变
 * <p>
 * 数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认的值
 * <p>
 * 两种常见的初始化方式“
 * 1、动态初始化（制定长度）
 * 2、静态初始化（制定内容）
 * <p>
 * 动态初始化数组的格式：
 * 数据类型[] 数组名称 = new 数据类型[数组长度]
 * <p>
 * 解析含义：
 * 1、左边的数据类型：也就是数组当中保存的数据，全部都是统一的什么类型
 * 左边的中括号：代表我是一个数据
 * 左边的数组名称：给数据取一个名称
 * ------------------------------
 * 2、右侧的new：代表创建数组的动作
 * 右侧数据类型：必须和左边的数据类型保持一致
 * 右侧中括号的长度：也就是数组当中，到底是可以保存多少个数据，是一个int数字
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 数据类型[] 数据名称 = new 数据类型[]

        // 创建一个数组，里面可以存放300个int数据
        int[] array = new int[300];
        // 创建一个数组，可以放10个double类型的数据
        double[] arrayB = new double[10];
        // 创建一个数组，能存放5个字符串
        String[] arrayC = new String[5];
    }
}
