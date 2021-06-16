package o4.com.RecursiveVsIterative.Solutions;

public class Main {
    public static void main(String[] args) {


        System.out.println(powerOfTwoIterative(4));

        /*   powerOfTwoIterative
        *   2^1 : 2
            2^2 : 4
            2^3 : 8
            2^4 : 16
            *
            * Alan kullanımı -> iteration (+)
            * Zaman verimliliği -> iteration (+)
            * Kolay kod yazımı -> iteration (-)
        * */

    }

    // RECURSIVE
    static int powerOfTwoRecursive(int n) {

        if(n == 0){
            return 1;
        } else {
            var power = 2 * powerOfTwoRecursive(n -1 );
            return power;
        }
    }

    // ITERATIVE
    static int powerOfTwoIterative(int n) {
        var i = 0;
        var power = 1;

        while( i < n){
            power = power * 2;
            i +=1;
            System.out.println("2^"+i+" : "+power);
        }

        return power;
    }


    
    
    
    
    
    
}
