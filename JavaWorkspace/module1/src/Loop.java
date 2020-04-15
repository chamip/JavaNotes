import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        System.out.println("请输入整数，-1表示结束：");
//        int number = in.nextInt();
//        double sum = 0;
//        int count = 0;
//        while(number!=-1){
//            sum += number;
//            count++;
//            number = in.nextInt();
//        }
//        if(count>0) {
//            sum /= count;
//        }
//        System.out.println("平均值为："+sum);

        System.out.print("请输入一个整数：");
        int value = in.nextInt();
        int tem = value;
        int figure=0;

        if(tem<0) {
            tem = -tem;
        }
//        else if(tem==0) {
//            figure++;
//        }
//        while(tem>0){
//            figure++;
//            tem /= 10;
//        }
        do {
            figure++;
            tem /= 10;
        } while (tem>0);
        System.out.println(value+"的位数是："+figure);
    }
}
