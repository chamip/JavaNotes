import java.util.Scanner;

public class Judge {
    public static void main(String[] args){
//        double a=1.0;
//        double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
//        System.out.println("a="+a+",b="+b);
//        System.out.println(a==b);
//        System.out.println(Math.abs(a-b)<1e-6);
        Scanner in = new Scanner(System.in);
        System.out.print("请输入金额：");
        int amount = in.nextInt();
        while(amount<10) {
            System.out.println("面值太小！！！");
            System.out.print("请重新输入：");
            amount = in.nextInt();
        }
        System.out.println("************");
        System.out.println("**Java线路**");
        System.out.println("*无指定座位*");
        System.out.println("*票价：10元*");
        System.out.println("************");

        System.out.println("找零：" + (amount - 10));
    }
}
