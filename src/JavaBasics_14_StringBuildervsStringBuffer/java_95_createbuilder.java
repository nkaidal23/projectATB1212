package JavaBasics_14_StringBuildervsStringBuffer;

public class java_95_createbuilder {
    public static void main(String[] args) {
        String s0 = "Neha";
        String s1 = new String("kaidal");
        //we will use string always rather than string builder buffer because we dont want to do manipulation
        StringBuilder stringBuilder = new StringBuilder("HELLO");
        StringBuffer stringBuffer = new StringBuffer("Kaidal");

        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(s1);
        System.out.println(stringBuilder.reverse());
    }
}
