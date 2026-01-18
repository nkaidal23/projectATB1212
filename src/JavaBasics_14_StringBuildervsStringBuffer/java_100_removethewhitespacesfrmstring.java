package JavaBasics_14_StringBuildervsStringBuffer;

public class java_100_removethewhitespacesfrmstring {
    public static void main(String[] args) {
        String str=("the testing academy");
        str=str.replaceAll("\\s","");
        System.out.println("stringw/ospaces"+str);
    }
}
