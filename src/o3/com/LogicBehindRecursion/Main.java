package o3.com.LogicBehindRecursion;

public class Main {
    public static void main(String[] args) {


        /*      STACK YAPISI ( Son Giren, İlk çıkar = İlk giren, Son çıkar) ( LAST IN FIRST OUT = LIFO )

        * | fourthMethod()  |   I'm a fourth method
        * | thirdMethod()   |   I'm a third method
        * | secondMethod()  |   I'm a second method
        * | firstMethod()   |   I'm a first method
          |_________________|
        *************************************/

        //      RECURSIVE METHOD
       // myrecursiveMethod(5);

        System.out.println("f(0) : "+f(0));

        /*  Oops , n is less than 1
            n values : 1
            n values : 2
            n values : 3
            n values : 4
            n values : 5
        *
        * En son yazılanı, ilk bastı. Çünkü STACK yapısı = Last In First Out = Son giren, ilk çıkar.
        * */

    }

    static void firstMethod(){
        secondMethod();
        System.out.println("I'm a first method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("I'm a Second method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("I'm a third method");
    }

    static void fourthMethod(){
        System.out.println("I'm a fourth method");
    }



    //          RECURSIVE METHOD
    static void myrecursiveMethod(int n) {
        if( n < 1){
            System.out.println("Oops , n is less than 1");
        }else {                                 // *** NOT else yazmazsan SONSUZ DÖNGÜYE GİRER.
            myrecursiveMethod(n-1);
            System.out.println("n values : "+n);
        }
    }



    //***************Recursive sum**********************
    static int f(int x) {
        if ( x < 0) {
            return -1;
        }
        if(x == 10){
            return 10;
        }
        System.out.println("x : "+x);
        return x + f(x+1); // Left Recursive Yapma!!!! sağda kalsın.

    }

    /* MANTIĞI   System.out.println("f(0) : "+f(0));
    * f(0) : 0 + f(1)
    * f(1) : 1 + f(2)
    * f(2) : 2 + f(3)
    * f(3) : 3 + f(4)
    *.........  Taki x == 10 olduğunda 10 dönderiyor. yani
    *
    *
    * f(9) : 9 + f(10)    // Burda f(10)'unu zaten biliyoruz alttan. yerine koyarsak => 9 + 10 = 19 olmuş oluyor. f(9) = 19
    *f(10) : 10     -> f(10) belli o halde geriye doğru değerleri koyalım.
    *
    * (!) ŞARTLAR İSE ŞÖYLE OLMALI :
    * 1 - Bitiş koşulu olmalı. Döngülerdeki gibi
    * 2 - Adım değeri olmalı, Sonsuz döngüye girmemsi için
    *
    * Not -> Bazı projelerde kullanımı yasaktır. Callback Stack'lerinin güvenlik açığından.
    *
    * */

}
