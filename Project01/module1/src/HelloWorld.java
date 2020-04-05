import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        注释：shift,方向键选中行，ctrl+/
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo:"+in.nextLine());
//        System.out.println(2+3+"=2+3="+(2+3));

//        一行定义一个变量，符合软件工程要求
        int price;
//        amount是常量，不能再被赋值
//        final int amount=100;
        int amount;
//        print表示没有回车
        System.out.print("请输入票面：");
        amount = in.nextInt();
        System.out.print("请输入金额：");
        price = in.nextInt();
        System.out.println(amount+"-"+price+"="+(amount-price));
    }
}
