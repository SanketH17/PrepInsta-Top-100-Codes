package M1_GettingStarted;

public class p22_DetectStrongNumber {
    public static void main(String[] args) {
        int num = 145;

        if(StrongNumber(num) == true)
            System.out.println("\n" + num + " is a Strong number\n");
        else
            System.out.println("\n" + num + " is not a Strong number\n");
    }

    public static boolean StrongNumber(int n){ // n = 145
        int digit, sum = 0;
        int temp = n;
        boolean flag = false;

        // we have to calculate 1! + 4! + 5!
        while(temp != 0){
            digit = temp % 10;

            sum = sum + fact(digit);
            temp /= 10;
        }
        if(sum == n)
            flag = true;
        else 
            flag = false;

        
        return flag;
    }

    public static int fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
}
