package M1_GettingStarted;



public class p13_PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int res = 0;
        int r;
        int temp = num;
        while(num > 0){
            r = num % 10;
            res = res * 10 + r;
            num = num / 10;
        }
        if(temp == res)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
