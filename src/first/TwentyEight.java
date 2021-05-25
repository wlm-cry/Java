package first;

/**
 * @author wlm
 * Day:28
 * Potic:典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class TwentyEight {
    public static void main(String[] args) {
        getLogarithmEveryMonth(6);
    }
    private static void getLogarithmEveryMonth(int month) {
        for (int i = 1; i <= month; i++) {
            System.out.println("第" + i + "个月的兔子的对数为：" + getLogarithm(i));
        }
    }
    private static int getLogarithm(int month) {
        if (month == 0) {
            return 0;
        } else if (month == 1) {
            return 1;
        } else if (month == 2) {
            return 1;
        } else {
            return getLogarithm(month - 1) + getLogarithm(month - 2);
        }
    }
}
/*
 * 发现这是一个斐波拉契数，也就是说满足：S(n-2)+S(n-1)=S(n)
 * 递归可以算出某一个月的兔子的对数.
 */