package M1_GettingStarted;
public class p06_GreatestOfThreeNos {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 58;
        int n3 = 36;

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is greater");
        }
        else if(n2 > n3){
            System.out.println(n2 + " is greater");
        }
        else{
            System.out.println(n3 + " is greater");
        }
    }
}
