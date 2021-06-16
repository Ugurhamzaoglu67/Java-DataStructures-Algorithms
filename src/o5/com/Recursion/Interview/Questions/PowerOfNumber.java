package o5.com.Recursion.Interview.Questions;

public class PowerOfNumber {
    public static void main(String[] args) {

        // How to calculate  power of a number  using recursion?
        //( bir sayının kuvvetini recursive olarak bulun)

        /* STEP 1
        *  x^n = x*x*x*x*x....n  kez.
        *  2^4 = 2*2*2*2   =>  4 kez, 2'nin çarpımı.
        *
        * 5^3 =  5*5*5   =>     üstükez, sayının tekrar tekrar çarpılması.

        * x^n  = x * (x^(n-1))
        *
        * Gerekli olanlar -> Taban sayı ve Üst sayı
        * */

        System.out.println(powerOfNumber(2,-3));
        System.out.println(powerOfNumber(2,3));
    }

    static double powerOfNumber(int base, int expo){
        if(expo < 0){
            expo = -1*expo;

          double result= base * powerOfNumber(base,expo-1);
           return (1/result);
        }
        if(expo == 0){
            return 1;
        }
        return base * powerOfNumber(base,expo-1);
    }


}
