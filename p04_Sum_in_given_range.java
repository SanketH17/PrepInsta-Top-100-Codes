public class p04_Sum_in_given_range {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 10;
        int sum = 0;
        for(int i = n1; i <= n2; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
