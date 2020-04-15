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

        //oa==ob判断oa和ob是否管理同一个数组
        int[] oa = {1,2,3,4,5};
        int[] ob = {1,2,3,4,5};
        System.out.println(oa==ob);

        //创建新数组，并把一个数组拷贝到新数组
        int[] a1 = {1,2,3,4,5,6};
        int[] b1 = new int[a1.length];
        for(int i=0;i<b1.length;i++){
            b1[i] = a1[i];
        }
        System.out.println(a1==b1); // false

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
