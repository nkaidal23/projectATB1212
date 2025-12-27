package JavaBasics_008_switchstatements;

import java.util.Scanner;

public class java_65_hasnextswitchstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
         int day = 1;
         //using has next function to understand that if loop has int in it or not bfre going to switch statements
        //break
        //default
        if (scanner.hasNextInt()){
        day = scanner.nextInt();
        }
                else {
            System.out.println("please enter INT");
        };
         switch (day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");

             default :
                 System.out.println("it is not integer");

        }
    }
}
