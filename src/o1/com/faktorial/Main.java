package o1.com.faktorial;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        var result = main.myfactorial(3);
        System.out.println(result);

    }


    public int myfactorial(int n) {
        if(n == 0  || n == 1){
            return 1;
        }

        return n * myfactorial(n-1);
    }
}
