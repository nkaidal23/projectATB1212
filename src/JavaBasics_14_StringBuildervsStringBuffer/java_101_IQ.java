package JavaBasics_14_StringBuildervsStringBuffer;

public class java_101_IQ {
        public static void main(String[] args) {
            String input = "TheTestingacademy";
            for (int i = input.length() - 1; i >= 0; i--) {
                System.out.print(input.charAt(i));
            }
            System.out.println(); // optional: newline after printing reversed string
        }
    }