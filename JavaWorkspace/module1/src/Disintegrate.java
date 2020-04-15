import java.util.Scanner;

public class Disintegrate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = in.nextInt();
        int result = 0;
        do{
            int digit = number%10;
            result = result*10+digit;
            number /= 10;
        }while(number>0);
        System.out.println("逆序结果是："+result);
    }
}
