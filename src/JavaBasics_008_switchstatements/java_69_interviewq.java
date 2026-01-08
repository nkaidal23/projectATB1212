package JavaBasics_008_switchstatements;

import java.util.Scanner;

public class java_69_interviewq {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please add char between A to D");
        String code = scanner.next();

        switch (code) {
            case "Bh":
                System.out.println("A");
                break;
            default:
                System.out.println("Hello please add char");
        }
    }
}
