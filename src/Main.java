import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       double[] digits ={5.3, -3, 15, -6.1, -9, -13, 14, 8.9, -11, 16, 2, 3, 1.5, 14, 12};
               double znach=0;
        for (double num:digits) {
            if (num<0){
                continue;
            }
            znach=znach+num;
        }
        System.out.println(Arrays.toString(digits));
        System.out.println(znach);
        System.out.println("sr="+znach/10);


        for (int i = 0; i < digits.length-1; i++) {
            for (int j = 0; j < digits.length ; j++) {
                if (digits[i]>digits[j]){
                        double b=digits[i];
                        digits[i]=digits[j];
                                digits[j]=b;
                }

            }
            //for (double j = 0; j < digits.length; j++) {
                System.out.println(Arrays.toString(digits));
                //System.out.println(j+1, digits[j]);
            }

        }
    }
}


