package o5.com.Recursion.Interview.Questions;


public class GreatestCommonDivisorEBOB {
    public static void main(String[] args) {
        // How to Find GCD ( Ebob ) two numbers using  recursion ?

        /*  EBOB BULMA
        *   8 = 2 * 2 * 2
        *   12 = 2 * 2 * 3
        *
        * ORTAK BÖLENLER => 2*2
        *
        *****euclidean algorithm*********
        * gcd(48,18)
        *
        * step-1 : 48/18 = 2, kalan 12
        * step-2 : 18/12 = 1, kalan 6
        * step-3 : 12/6  = 2, kalan 0
        *
        *
        * GCD(x,0) = x
        * GCD(x,y) = GCD(y, x % y)
        *
        *
        * */

        int result = GCD(32,26);
        System.out.println(result);

    }

    public static int GCD(int x, int y) {

        if(x < 0 || y<0 ){
            return -1;
        }

        if(y == 0){
            return x;       // return GCD(4,0) olduğunda, yani ikinci sayı sıfırken, diğeri x bulunmuştur.
                            // Bundan başka  mod alma, ( 0'a bölme yapma ) o sonucu yani x'i return et.
        }

        //** NOT -> SADECE return GCD(y, x % y); Yazarsak -> / by zero hatası fırlatır.
        return GCD(y, x % y);
    }



}
