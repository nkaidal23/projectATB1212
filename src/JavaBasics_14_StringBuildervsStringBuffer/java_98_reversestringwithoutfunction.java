package JavaBasics_14_StringBuildervsStringBuffer;

public class java_98_reversestringwithoutfunction {
    public static void main(String[] args) {
        String input = "Pramod";

        for(int i = input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }
        //reverse without using inbuilt function;
    }
}
