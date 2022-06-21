package M1_GettingStarted;

public class p14_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int sum = 0, r;
        int temp = num;
        while(num > 0){
            r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if(sum == temp)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
