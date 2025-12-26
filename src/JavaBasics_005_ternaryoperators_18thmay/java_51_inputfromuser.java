package JavaBasics_005_ternaryoperators_18thmay;

public class java_51_inputfromuser {
    //CLI (command line input)
    //scannerclassimmp
    //bufferreader
    //files as input
    public static void main(String[] args) {
        String user_input = args[1];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String result = (age<18) ? "minor" : (age>65) ? "senior citizen" : "Adult" ;
        System.out.println(result);
    }
}
