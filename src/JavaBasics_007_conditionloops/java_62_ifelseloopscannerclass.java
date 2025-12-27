package JavaBasics_007_conditionloops;

import java.util.Scanner;

public class java_62_ifelseloopscannerclass {
    public static void main(String[] args) {
        System.out.println("enter your age here");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>18){
            System.out.println("i am adult");
        }
else{
            System.out.println("iamminor");
        }
    }
}
