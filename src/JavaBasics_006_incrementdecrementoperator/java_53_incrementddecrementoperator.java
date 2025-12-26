package JavaBasics_006_incrementdecrementoperator;

public class java_53_incrementddecrementoperator {
    public static void main(String[] args) {
        //preincrement ++a operand
        //value is incremented first then stored in the result
        //post a++
        //print first then increase the value

     //   ERT (expression and result table)
       // Line no | a | result of b
        //increment operator
        int a = 10 ;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        //++a = a+1
        //it will increment frst then store

        //ERT expression and result table
        // Line no |a| result of b
        //13  | 10 | NA
        //14 | 11 | 11
        //15 | 11 -PINT | 11
        //16 | 11 | 11- pint


    }
}
