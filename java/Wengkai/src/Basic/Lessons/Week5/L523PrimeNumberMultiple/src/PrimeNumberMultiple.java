package Basic.Lessons.Week5.L523PrimeNumberMultiple.src;

public class PrimeNumberMultiple {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[100];
        for (int i =0; i<isPrime.length;i+=1){
            isPrime[i] = true;
        }
        for (int i = 2; i<isPrime.length;i+=1){
            if (isPrime[i]){
                for (int k = 2;i*k<isPrime.length; k+=1){
                    isPrime[i*k] = false;
                }
            }
        }
        int cnt = 0;
        for (int i=2; i<isPrime.length;i+=1){
            if (isPrime[i]){
                System.out.print(i+"\t");
                cnt+=1;
            }
            if (cnt%5==0 && isPrime[i]){
                System.out.println();
            }
        }
    }
}
