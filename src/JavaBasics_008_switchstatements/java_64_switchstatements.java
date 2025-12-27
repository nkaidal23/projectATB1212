package JavaBasics_008_switchstatements;

import java.util.Scanner;

public class java_64_switchstatements {
    public static void main(String[] args) {
        //  multiple condition/statements
        //java switch statements executes one staatements and multiple condition
        //java switch expression must be of byte,long,short,int(with its wrappper type)enums and string
        //****** float and boolean is not there*****
        //the value for case must be constant and literals.variables are not allowed

        // Switch (expression)
        //{
        //case statements
        //value must be of same type of expression
        //    case value1 : expression = value1
        // statemnts
        //  break is optional
        //}

        //u need to tae input and ask for integer from 1 to 7
        //and if user enters 1 to 7
        //you will tell which day it is

        //1. using the scanner class
        //2. expression and day
        //3 rough logic
        //4 write fix and optimize the logic
        //5 figure out the edge cases

        System.out.println("enter the number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = 1;
        if (scanner.hasNextInt()) {
            day = scanner.nextInt();
        }
        else {
            System.out.println("you are mad why are you entering non INT values");
        }

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("enter int from 1 to 7 only");
        }
        System.out.println("End of thr program");
     }
}
