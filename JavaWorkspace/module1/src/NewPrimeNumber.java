public class NewPrimeNumber {
    public static void main(String[] args){
        //100以内的素数
        boolean[] isPrime = new boolean[100];
        for(int i=0;i<isPrime.length;i++){
            isPrime[i] = true;
        }
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i]){
                for(int k=2;i*k<isPrime.length;k++){
                    isPrime[i*k] = false;
                }
            }
        }
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //前50个素数
        int[] primes = new int[50];
        primes[0] = 2;
        int count = 1;
        MAIN_LOOP:
        for(int x=3;count<primes.length;x++){
            for(int i=0;i<count;i++){
                if(x%primes[i]==0){
                    continue MAIN_LOOP;
                }
            }
            primes[count++] = x;
        }
        for(int k : primes){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
