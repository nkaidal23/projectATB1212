package JavaBasics_005_ternaryoperators_18thmay;

public class java_50_realageclassification {
    public static void main(String[] args) {
        //i/p = age = int = 27;
        //o/p string =
       // string age = age < 18 = minor ,age > 18 <65 = adult , age > 65 = senior ;
        int age1 = 27 ;
        String age1 = (age1<18) ? "minor" : (age1>65) ? "senior" : "Adult" ;
        System.out.println(age1);

    }
}
