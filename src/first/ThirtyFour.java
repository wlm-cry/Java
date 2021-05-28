package first;

import java.util.ArrayList;

/**
 * @author wlm
 * Day:34
 * Topic:输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * matrix 矩阵
 */
public class ThirtyFour {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        System.out.println(getList(matrix));
    }
    public static ArrayList<Integer> getList(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int layers = (Math.min(n,m)%2 == 0 ? Math.min(n,m)/2 : Math.min(n,m)/2+1);
        for (int i = 0; i < layers; i++) {
            if (i < (m - i)) {
                for (int k = 0; k < m - i; k++) {
                    result.add(matrix[i][k]);
                }
            } else {
                break;
            }
            if ((m-i-2) >= i) {
                for (int k = m - i -2; k >= i; k--) {
                    result.add(matrix[n-i-1][k]);
                }
            } else {
                break;
            }
            if ((n-i-2) > i) {
                for (int k = n-i-2; k > i; k--) {
                    result.add(matrix[k][i]);
                }
            } else {
                break;
            }
        }
        return result;
    }
}
