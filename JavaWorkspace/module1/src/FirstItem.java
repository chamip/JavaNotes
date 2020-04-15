import java.util.Scanner;

public class FirstItem {
    public static void main(String[] args){
//        System.out.println(1.2-1.1);
        int foot;
        double inch;
//        foot = (int) (30/3.0);
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println("foot="+foot+",inch="+inch);
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
    }
}
