package JavaBasics_010_Whileloop;

import java.util.Scanner;

public class java_83 {
        public static void main(String[] args) {
            // Factorial Program

            // The logic building formula we are discussing.
            // Step number one, you have to figure out what is the data type for input and output.
            // Step number two, write a rough logic around this.
            // Step number three, write a proper logic around this.
            // Step number four, optimize.
            // Step number five, which is edge cases.

            Scanner scanner  = new Scanner(System.in);
            System.out.println("Welcome to Factorial Program");
            System.out.println("Enter the number, whose factorial you want!");

            int number = scanner.nextInt();
            int factorial = 1;

            int i = 1;
            while(i<=number){
                factorial = factorial * i;
                i++;
            }

            System.out.println("factorial is -> "+factorial);

        }
    }