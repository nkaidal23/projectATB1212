package task;

import java.util.Scanner;

public class java_switchstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teh school grade");
        String grade = scanner.next();

        switch (grade){
            case "a":
                System.out.println("Excellent grade");
                break;
            case "B":
                    System.out.println("Needs improvement");
                    break;
            case "F":
                System.out.println("fail");
                break;
            default:
                System.out.println("please enter grade scored");
        }
    }
}
