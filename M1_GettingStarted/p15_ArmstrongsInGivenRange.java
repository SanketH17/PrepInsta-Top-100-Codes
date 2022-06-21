package M1_GettingStarted;

public class p15_ArmstrongsInGivenRange {
    public static void main(String[] args) {
        int low = 10;
        int high = 1000;
        for(int i = low; i <= high; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }        
        }
    }

    public static boolean isArmstrong(int num){
        int sum = 0, r;
        int temp = num;
        while(num > 0){
            r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
}


