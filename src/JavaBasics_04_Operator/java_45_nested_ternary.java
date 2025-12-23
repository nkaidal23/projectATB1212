package JavaBasics_04_Operator;

public class java_45_nested_ternary {
        public static void main(String[] args) {
           //result = conditional1 ? expression1 : (conditon2 ? expression3 : expression4) : expression5;
            int number = 65;

            String result = (number > 18)
                    ? (number > 25 ? "you can drink" : "you can't drink")
                    : "You are underage";

            System.out.println(result);
        }
    }