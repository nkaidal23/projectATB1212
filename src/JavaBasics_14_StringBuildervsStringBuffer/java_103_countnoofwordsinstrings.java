package JavaBasics_14_StringBuildervsStringBuffer;

public class java_103_countnoofwordsinstrings {
    public static void main(String[] args) {
        String str = "The tetsing academy";
        String [] words =str.split("\\s");
        System.out.println("noofwords: " + words.length);
    }
}
