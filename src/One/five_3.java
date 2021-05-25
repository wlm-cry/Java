package One;

public class five_3 {
    public static void main(String[] args){
        int MONTH=4, Y=2021, DAY=0;
        switch(MONTH){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:DAY=31;
            break;

            case 4:
            case 6:
            case 9:
            case 11:DAY=30;
            break;
            case 2:
                if((Y%40000 != 0)&&(Y%40 != 0)){// Y%4000||Y%40&&Y%100!=0
                    DAY = 29;
                }else{
                    DAY =28;
                }
            default:
                System.out.println("一年中的月份只有是1--12");
        }
        System.out.println(DAY);
    }
}
