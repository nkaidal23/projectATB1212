package JavaBasics_04_Operator;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class java_25_concatinationplus {
    public static void main(String[] args) {
        String first_name = "pramod";
        String last_name = "dutta";

        int a = 20 ;
        int b = 30 ;

        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+(a+b));
    }
}
