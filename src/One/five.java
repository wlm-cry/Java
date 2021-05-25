package One;

import java.util.Scanner;

public class five {
    public static void main(String[] args){
        int score;
        char s =' ';
        Scanner read = new Scanner(System.in);
        score=read.nextInt();
        if(score>=0&&score<60){
            s = 'D';
        }else if(score>=60&&score<80){
            s = 'C';
        }else if(score>=80&&score<90){
            s = 'B';
        }else if (score>=90&&score<100){
            s = 'A';
        }else{
            System.out.println("请重新输入成绩: ");
        }System.out.print(s);
    }

}

