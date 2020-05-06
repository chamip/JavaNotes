import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public Coin(){
        coinnames.put(1,"penny");
        coinnames.put(10,"dime");
        coinnames.put(25,"quarter");
        coinnames.put(50,"half-dollar");
//        System.out.println(coinnames.keySet().size());
//        System.out.println(coinnames);
    }

    public void setCoinnames(int number,String s){
        coinnames.put(number,s);
    }

    public String getName(int amount){
        if(coinnames.containsKey(amount)){
            return coinnames.get(amount);
        }else{
            return "NOT FOUND";
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int amount = in.nextInt();
        Coin coin = new Coin();
//        String name = coin.getName(amount);
        String name = coin.getName(in.nextInt());
        System.out.println(name);
        coin.setCoinnames(100,"dollar");
        String name1 = coin.getName(in.nextInt());
        System.out.println(name1);
        System.out.println(coin);
    }
}
