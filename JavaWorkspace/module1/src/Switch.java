import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int type = in.nextInt();
        switch (type){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("Goodbye!!!");
                break;
        }
    }
}
