package JavaBasics_04_Operator;

public class java_31_compound_assignment_operators {
    public static void main(String[] args) {
        //+= -+ /+ *=
        int age = 10;
        age = age+10;
        System.out.println(age);

        //age += 10
        int age1 = 20;
        age1 += 30;
        System.out.println(age1);

        int age2 = 30;
        age2 /= 20 ;
        System.out.println(age2);

        int height = 10 ;
        height -= 20 ;
        System.out.println(height);

        int inch = 9 ;
        inch *= 2;
        System.out.println(inch);
    }
}
