package first;

/**
 * @author wlm
 *Day:35
 * topic:有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 *
 * 程序分析：请抓住分子与分母的变化规律。分数：fraction
 *
 *        1、第一项是2/1
 *
 *        2、前面一项分子和分母相加的和，为下一项的分子
 *
 *        3、前面一项分子，为下一项的分母
 */
public class ThirtyFive {
    public static void main(String[] args) {
        float molecular = 2;
        float denominator = 1;
        float fraction = molecular / denominator;
        float temp = 0;
        float sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += fraction;
            temp = molecular + denominator;
            denominator = molecular;
            molecular = temp;
            fraction = molecular / denominator;
        }
        System.out.println(" " + sum);
    }
}
