package JavaBasics_002_Variables;

public class java_11_costants {
    public static void main(String[] args) {
       // int a = 10 ;
       // System.out.println(a);
        //local variable value will not be assigned by JVM
        // only instance and static variable is assigned by JVM
         final int a = 10;
       // a=11; java cannot assigned value to final variable
        System.out.println(a);

        // final variable cannot be assigned twice;
    }
}
