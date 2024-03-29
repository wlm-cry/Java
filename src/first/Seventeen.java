package first;

/**
 * @author wlm
 * Day:17
 * Potic:判断101-200之间有多少个素数，并输出所有素数。
 */
public class Seventeen {
     public static void main(String[] args) {
          int count = 0;
          for (int i = 101; i < 200; i += 2) {
               boolean flag = true;
               for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                         flag = false;
                         break;
                    }
               }
               if (flag) {
                    count++;
                    System.out.println(i);
               }
          }
          System.out.println(count);
     }
}
/*
第十九行代码：if (flag==true) ----变成if （flag)   这是为什么？
 */