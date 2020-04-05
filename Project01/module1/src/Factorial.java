import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Factorial {
    public static void main(String[] args){
        //a *= b+6 <==>a = a*(b+6)

//        i=6;
//        a = i++; -> a = 6 ,i = 7
//        a = ++i; -> a = 7,i = 7
        Scanner in = new Scanner(System.in);
        System.out.print("请输入整数：");
        int n = in.nextInt();
        int factor = 1;
//        int i = 1;
//        while(i<=n){
//            factor *= i;
//            i++;
//        }
        for(int i=1;i<=n;i++){
            factor *= i;
        }
        System.out.println(n+"的阶乘是："+factor);
    }
}
