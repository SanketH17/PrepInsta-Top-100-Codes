package M1_GettingStarted;

public class p12_ReverseNumber {
    public static void main(String[] args) {
        int num = 12;
        int r;
        int res = 0;
        while(num > 0){
            r = num % 10;
            res = res * 10 + r;
            num = num / 10;
        }
        System.out.println(res);
    }
}
