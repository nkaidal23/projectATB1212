package JavaBasics_14_StringBuildervsStringBuffer;

public class java_102_stringobjectsareimmutable {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("world");
        System.out.println(str);

        //string is immutable
    }
}
