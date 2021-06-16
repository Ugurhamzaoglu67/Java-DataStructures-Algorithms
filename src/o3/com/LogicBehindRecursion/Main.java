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
        myrecursiveMethod(5);

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

}
