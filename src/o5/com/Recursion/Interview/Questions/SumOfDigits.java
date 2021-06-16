package o5.com.Recursion.Interview.Questions;




public class SumOfDigits {
    public static void main(String[] args) {
        // How to find the sum of digits of a positive Integer number using recursion?
        //( Özyinelemeyi kullanarak pozitif bir Tamsayı'nın rakamlarının toplamı nasıl bulunur?)

        /* STEP -1
        *   10 =>    10/10   1 kere ve kalan : 0
        *
        *   46 =>    46/10   4 kere ve kalan : 6
        *
        *  158 =>    156/10  15 kere ve kalan:  8 ve devamı..
        *            15/10    1 kere ve kalan : 5
        *
        *  112 =>    112/10  11 kere  ve kalan : 2
        *            11/10    1 kere ve kalan  : 1
        *
        * ____________________________________________
        *
        *  f(n) = (n % 10)  +  f(n/10)
        * f(46) = (46 % 10 ) + f(46/10)
        *           KALAN    +  BÖLÜM
        * */

        /* STEP 2  -> STOP  CONDITION
        *  n == 0
        * */


        System.out.println(f(1231231231));
    }
    static int f(int n) {
        if(n == 0  || n < 0){
            return 0;
        }
        return (n % 10 ) + f(n / 10);
    }


}
