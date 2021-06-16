package o2.com.Fibonacci;

public class Main {
    public static void main(String[] args) {
        /*
        * Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        * Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        * yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
        * Bu durumda genel olarak n'inci Fibonacci sayısı F(n) şu şekilde ifade edilir:
        * 0,1,1,2,3,5,8,13,21,34            // Gerçek hayat örnek -> Russian Doll
        * f(n)  = f(n-1) + f(n-2)
        *
        * */

        var result =  myfibo(8);       // kendinden bir önceki + kendinden 2 önceki = n yani 8
        System.out.println(result);

        openRussianDoll(5);
    }

    // FIBONACCI
    public static int myfibo(int n) {
        if(n < 0){
            return -1;
        }

        if (n == 0 || n == 1) {         // Bunu yazmazsak, altta sonsuz döngü...
            return n;
        }
        return myfibo(n-1) + myfibo(n-2);
    }


    // *(BONUS) RUSSION DOLL & Recursion
    public static void openRussianDoll(int oyuncakBebek) {
        if(oyuncakBebek == 1 ){
            System.out.println("Açılacak oyuncak bebek kalmadı.");
        }
        else {      // açılacak oyuncak bebek varsa açmaya devam
           openRussianDoll(oyuncakBebek -1 );
            System.out.println(oyuncakBebek);// her seferinde bir ufağını aç taki açacak olmayınca kadar.
        }
    }



}
