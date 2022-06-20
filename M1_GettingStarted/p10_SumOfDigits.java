package M1_GettingStarted;
/*
 sum of digits of a given number

 */

public class p10_SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        int r;
        while(n > 0){
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }

        System.out.println(sum);
    }   
}
