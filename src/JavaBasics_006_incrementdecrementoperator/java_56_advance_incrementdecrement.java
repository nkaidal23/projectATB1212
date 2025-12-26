package JavaBasics_006_incrementdecrementoperator;

public class java_56_advance_incrementdecrement {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(a++ + a);
         //10 //+1 = 11 == 10 + 11 //21

        int a1 = 10 ;
        System.out.println(a1++ + ++a1);
        System.out.println(a1);

        //divide and conquer
        //ERT// Line no | A | result of b
        // 9 | 10 | NA
        // 10 | 10 - +1 / 10  ++ 12 =22
        // 12
    }
}
