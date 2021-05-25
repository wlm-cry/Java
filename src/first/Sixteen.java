package first;

/**
 * @author wlm
 * Day:16
 * Potic:求0，1，2，3，4，5，6，7所能组成的8位奇数个数。
 */
public class Sixteen {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        compose(arr);
    }
    public static void compose(int[] arr) {
        int oddCount = 0;
        for (int value : arr) {
            if (!isParity(value)) {
                oddCount++;
            }
        }
        int num = factorial(arr.length-1);
        System.out.println("The following figures：");
        printArry(arr);
        System.out.println("Odd number that can be generated "+oddCount*num);
    }
    private static boolean isParity (int num) {
        return num % 2 != 1;
    }
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
    private static void printArry(int[] arr) {
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }
}

// 系统自动改过之后好像程序变得更加的简洁美观了，这是为什么？

/*
public class Sixteen {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        compose(arr);
    }
    public static void compose(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isParity(arr[i])) {
                oddCount++;
            }
        }
        int num = factorial(arr.length-1);
        System.out.println("The following figures：");
        printArry(arr);
        System.out.println("Odd number that can be generated "+oddCount*num);
    }
    private static boolean isParity (int num) {
        if (num % 2 ==1) {
            return false;
        }else {
            return true;
        }
    }
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
    private static void printArry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}

 */