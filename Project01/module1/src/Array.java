import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = a; //管理者不是所有者
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
            b[i]++;
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);

        //        System.out.print("请输入数值，-1表示结束：");

        System.out.print("请输入元素个数：");
        double sum = 0;
        int count = 0;
        count = in.nextInt();
        if(count>0) {
            // int[] numbers = {1, 2, 3}
            int[] numbers = new int[count];
            System.out.print("请输入数值：");
            for(int i=0;i<numbers.length;i++){
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double average = sum / count;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
            System.out.println("总和是：" + sum + "！总共有 " + count + "个数！" + "均值是：" + average);
        }
    }
}
