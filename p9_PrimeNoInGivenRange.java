

public class p9_PrimeNoInGivenRange {
    public static void main(String[] args) {
        int low = 20;
        int high = 50;
        for(int i = low; i <= high; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }        
    }

    public static boolean isPrime(int n) {
        for(int div = 2; div * div <= n; div++){
            if(n % div == 0)
                return false;
        }
        return true;
    }
}
