package M1_GettingStarted;

public class p20_Factors {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
