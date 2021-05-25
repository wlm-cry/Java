package One;

/**
 * @author wlm
 */
public class eight_2 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println("s: "+s);
    }
    public static String arrayToString(int[] arr){
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ",";
            }

        }
        s += "]";
        return s;
    }
}
/*
    题目：拼接字符串： 定义一个方法，把int数组中的元素按照指定的格式拼接成一个字符串返回；
        调用该方法， 并在控制台中输出结果

 */
