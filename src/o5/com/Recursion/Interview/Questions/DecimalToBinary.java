package o5.com.Recursion.Interview.Questions;




public class DecimalToBinary {

    public static void main(String[] args) {
        // How to convert from Decimal to Binary with recursion ?

        /* ondalıktan -> ikili'ye çevirme.
        *
        * step 1 : 10/2 -> Bölüm 5, kalan 0
        * step 2 : 5/2 -> Bölüm 2, kalan 1
        * step 3 : 2/2 -> Bölüm 1, kalan 0
        * step 4 : 1/2 -> Bölünemiyor Tam sayı olarak, ve tam sayıs olarak 0 işte burda işlem bitiyor.
        *
        * 10 sayısının 2 lik tabanda karşılık 1010
        *
        * f(n) = n mod 2 + 10 * f(n/2)      Matematiksel Formülü
        * */

        System.out.println(decimalToBinary(10));
    }

    public static int decimalToBinary(int n) {
        if(n ==0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }


}
