public class p2_CheckPrime {
    public static void main(String[] args) {
        int n = 32;
        boolean prime = true;
        for(int div = 2; div * div <= n; div++){
            if(n % div == 0){
                prime = false;
                System.out.println("Not Prime");
                return;
            }
        }
        if(prime){
            System.out.println("Prime number");
        }
    }
}
