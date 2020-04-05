import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数值，-1表示结束：");
        int x;
        int[] numbers = new int[100];
        double sum = 0;
        int count = 0;
        x = in.nextInt();
        while(x!=-1){
            numbers[count++] = x;
            sum += x;
            x = in.nextInt();
        }
        double average = sum/count;
        if(count>0){
            for(int i=0;i<count;i++){
                if(numbers[i]>average){
                    System.out.print(numbers[i]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("总和是："+sum+"！总共有 "+count+"个数！"+"均值是："+average);
    }
}
