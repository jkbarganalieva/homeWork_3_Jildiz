import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] digits = {5.3, -3, 15, -6.1, -9, -13, 14, 8.9, -11, 16, 2, 3, 1.5, 14, 12};
        int k = 0;
        double znach = 0;
        boolean bool=false;
        for (double num : digits) {
            if (num < 0) {
                bool=true;
            }else if(bool){
            k = k + 1;
            znach = znach + num;
        }}
        System.out.println(k);
        System.out.println(Arrays.toString(digits));
        System.out.println(znach);
        System.out.println("sr=" + znach / k);
       System.out.println("==="+min(digits));

           }
    public static double min(double[] digits ){
        double minInbox=0;
        double minValue=digits[0];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i]<minValue){
                minValue=digits[i];
                minInbox=i;
            }

        }
        return minInbox+minValue;
    }
}


