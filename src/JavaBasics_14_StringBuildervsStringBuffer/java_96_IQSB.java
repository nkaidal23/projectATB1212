package JavaBasics_14_StringBuildervsStringBuffer;

import java.sql.SQLOutput;

public class java_96_IQSB {
    public static void main(String[] args) {
        StringBuffer string1 = new StringBuffer("Hello");
        string1.append("dutta");
//append = join
        System.out.println(string1);

        StringBuilder n2 = new StringBuilder("testing");
        System.out.println(n2);
        n2.append("academy");
        System.out.println(n2);
        String ne1="The";
        System.out.println(ne1);
        n2.reverse();
        System.out.println(n2);
    }
}
