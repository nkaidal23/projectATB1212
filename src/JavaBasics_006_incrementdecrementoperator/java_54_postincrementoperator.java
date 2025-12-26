package JavaBasics_006_incrementdecrementoperator;

public class java_54_postincrementoperator {
    public static void main(String[] args) {
        //postincrement - print first then increase
        int a_post = 10 ;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);
        //ERT
       // LINE NO | A | result of b
         // 6| 10 | NA
        // 7 || 11 | 10
        // 8 |11 | NA
        //9 | 11 | 10

        int a_post1 = 15 ;
        System.out.println(a_post1++); // print then increment //15 ++
        System.out.println(a_post1); // 16

        //
    }
}
