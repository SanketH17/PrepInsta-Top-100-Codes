package M1_GettingStarted;

public class p16_Fibonacci {
    public static void main(String[] args) {
        
     int num = 15;
     int a = 0, b = 1;

     // Here we are printing 0th and 1st terms
     int nextTerm;
       System.out.print (a + " , " + b + " , ");
        for (int i = 2; i < num; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print (nextTerm + " , ");
       }
   
    }
}
