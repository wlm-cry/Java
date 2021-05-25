package first;

/**
 * @author wlm
 * Day:21
 * Potic:两个队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
 * 已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比赛，c说他不和x,z比，编写程序找出三队赛手的名单
 */
public class TwentyOne {
    public static void main(String[] args) {
        char[] arrOne = {'a', 'b', 'c'};
        char[] arrTwe = {'x', 'y', 'z'};
        for (char c : arrOne) {
            for (int j = 0; arrOne.length > j; j++) {
                if (c == 'a' && arrTwe[j] == 'x') {
                    continue;
                } else if (c == 'c' && (arrTwe[j] == 'x' || arrTwe[j] == 'z')) {
                    continue;
                } else if (c == 'a' && arrTwe[j] == 'y') {
                    continue;
                } else if (c == 'b' && arrTwe[j] == 'y') {
                    continue;
                } else if (c == 'b' && arrTwe[j] == 'z') {
                    continue;
                } else {
                    System.out.println(c + " VS " + arrTwe[j]);
                }
            }
        }
    }
}
//for (int i = 0; i < arrOne.length; i++) 第十四行
