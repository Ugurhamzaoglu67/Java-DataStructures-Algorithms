package o5.com.Recursion.Interview.Questions;



public class StringReverse {
    public static void main(String[] args) {

        /* .substring(1)   -> 1.indeks dahil en sona kadar al
        *  .charAt(0)      -> 0.indekstekini al demek . Bunun ise ilk elemanı en son tarafa eklemesi
        *
        *   Selam verdik
        *   male + S
        *   maleS
        * */
        System.out.println(   reverseStr("Selam"));

    }

    public static String reverseStr(String myStr) {
        if(myStr.isEmpty()){
            return myStr;
        }

        return  reverseStr(myStr.substring(1))+ myStr.charAt(0);
    }
}
