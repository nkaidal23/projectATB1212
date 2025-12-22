package JavaBasics_04_Operator;

public class java_41_explicitnarrowing {
    public static void main(String[] args) {
        long phone_no = 7897789807l;
        //short s = phone_no = implicit narrowing
        short s =  (short)phone_no; // explicit narrowing
        System.out.println(s);//narrowing is never going to store full value

    }
}
