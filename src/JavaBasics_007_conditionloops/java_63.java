package JavaBasics_007_conditionloops;

import java.util.Scanner;

public class java_63 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner =new Scanner(System.in);
        int age = scanner.nextInt();

       if (age>18){
           System.out.println("you are allowed to enter mall");
       }
       else{
           System.out.println("you are not allowed");
       }

    }
}
