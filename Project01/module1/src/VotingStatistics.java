import java.util.Scanner;

public class VotingStatistics {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入0-9之间的数字，-1表示结束！");
        int[] result = new int[10];
        int num = in.nextInt();
        while(num!=-1){
            if(num>=0 && num<=9) {
                result[num]++;
            }
            num = in.nextInt();
        }
        System.out.println("0-9之间的数字出现的次数如下：");
        for(int i=0;i<result.length;i++){
            System.out.println(i+":"+result[i]);
        }
    }
}
