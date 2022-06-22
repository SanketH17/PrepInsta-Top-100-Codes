package M1_GettingStarted;

public class p23_PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(sum == n){
            System.out.println("\n" + n + " is a perfect number\n");
        }
        else{
            System.out.println("\n" + n + " is not a perfect number\n");
        }
    }
}
