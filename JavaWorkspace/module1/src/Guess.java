import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        int number = (int)(Math.random()*100+1);
        //  [0,1)-->[0,100]-->[1,100]
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你猜的数值：");
        int myGuess;
        int count=0;
        do{
            myGuess=in.nextInt();
            count++;
            if(myGuess>number){
                System.out.println("偏大！");
            }else if(myGuess<number){
                System.out.println("偏小！");
            }
        } while(myGuess!=number);
        System.out.println("你猜中了！总共猜了"+count+"次！");
    }
}
