package M1_GettingStarted;
public class p08_Sum_of_firstN_nos {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
