import java.util.Scanner;

public class SeekaNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] data = {3,4,5,1,2,7,8};
        int x = in.nextInt();
        int loc = -1;

        boolean found = false;
        //for-each循环，适合遍历
        for(int k : data){
            if(x==k){
                found = true;
                break;
            }
        }
        System.out.println(found);

        for(int i=0;i<data.length;i++){
            if(x==data[i]){
                loc = i;
                break;
            }
        }
        if(loc>-1){
            System.out.println(x+"的位置在下标索引"+loc+"处");
        }else{
            System.out.println("数组中没有"+x+"这个元素！");
        }
    }
}
