package first;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author wlm
 * Day:27
 * Potic:有五个学生，每个学生有3门课的成绩，
 * 从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，
 * 把原有的数据和计算出的平均分数存放在磁盘文件 "lalala"中。
 */
public class TwentySeven {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String[][] a = new String[5][6];
        for (int i = 1; i < 6; i++) {
            System.out.print("请输入第" + i + "个学生的学号：");
            a[i - 1][0] = ss.nextLine();
            System.out.print("请输入第" + i + "个学生的姓名：");
            a[i - 1][1] = ss.nextLine();
            for (int j = 1; j < 4; j++) {
                System.out.print("请输入该学生的第" + j + "个成绩：");
                a[i - 1][j + 1] = ss.nextLine();
            }
            System.out.println("\n");
        }
        float avg;
        int sum;
        for (int i = 0; i < 5; i++) {
            sum = 0;
            for (int j = 2; j < 5; j++) {
                sum = sum + Integer.parseInt(a[i][j]);
            }
            avg = (float) sum / 3;
            a[i][5] = String.valueOf(avg);
        }
        String s;
        try {
            File f = new File("D:\\stud");
            if (f.exists()) {
                System.out.println("文件存在");
            } else {
                System.out.println("文件不存在，正在创建文件");
                f.createNewFile(); //不存在则创建

            }
            BufferedWriter output = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    s = a[i][j] + "\r\n";
                    output.write(s);
                }
            }
            output.close();
            System.out.println("数据已写入D盘文件中！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

