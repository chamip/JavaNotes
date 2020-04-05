import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //计算前50个素数
        int count = 0;
        for(int n=2;count<50;n++){
//            int isPrime = 1;
            boolean isPrime = true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.print(n+" ");
                count++;
                if(count%5==0){
                    System.out.println();
                }
            }
        }
//        Scanner in = new Scanner(System.in);
//        System.out.print("请输入一个整数：");
//        int n = in.nextInt();

        //计算前100中的素数
//        for (int n = 2; n < 100; n++){
//            int isPrime = 1;
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    isPrime = 0;
//                    break;
//                }
//            }
//            if (isPrime == 1) {

                //System.out.println(n + "是素数！");

//                System.out.print(n+" ");

            //} else {
                    //System.out.println(n + "不是素数！");
                //}
//        }
    }
}


