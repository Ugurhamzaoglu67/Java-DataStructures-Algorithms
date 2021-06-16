package o1.com.faktorial;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        var result = main.myfactorial(5);
        System.out.println(result);

        /*

            Java 10 ile birlikte “var” ile sadece yerel değişkenler tanımlanabilir.
        *   Yerel değişkenlerde kullanılabilir.
            Lambda ifadelerinde kullanılmaz
            “var” ile tanımlanan değişkene başlangıç olarak null atanamaz.
            “var” ile tanımlanan değerin mutlaka initalize olması gerekir.
            “var” ile stream işlemleri yapılabilir.
        *
        *
        * */


    }


    public int myfactorial(int n) {
        if(n < 0){
            return -1;
        }

        if(n == 0  || n == 1){
            return 1;
        }

        return n * myfactorial(n-1);
        /*
             myfactorial(4)  için

         -> return 4 * myfactorial(3);       -> 4*6
          -> return 3 * myfactorial(2);     -> 3*2
          -> return 2 * myfactorial(1);     -> 2*1
                        Yukardaki fonktan 1 çıkar  ve n==1 olana girer. ordan sonra 2*1 olarak geri döndürür.
        */
    }
}
