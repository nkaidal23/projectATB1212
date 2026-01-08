package JavaBasics_008_switchstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class java_70_switchstatement_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int monthno = scanner.nextInt();

        switch (monthno) {
            case 1:
                System.out.println("january it has 31 days");
                break;
            case 2:
                System.out.println("febrauary it is leap year");
                break;
            case 3:
                System.out.println("march it has 30 days");
                break;
            default:
                System.out.println("enter month no");
        }
    }
}
