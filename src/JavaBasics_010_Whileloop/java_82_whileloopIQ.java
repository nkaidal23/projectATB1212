package JavaBasics_010_Whileloop;

import java.util.Scanner;

public class java_82_whileloopIQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for which you want factorial");

        int number = scanner.nextInt();
        int factorial=1;

        int i=1;
        while (i<=number){
        factorial = factorial * i;
            i++;
        }
        System.out.println("factorial ->"  +  factorial);
        }
    }
