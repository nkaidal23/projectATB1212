package JavaBasics_008_switchstatements;

import java.util.Scanner;

public class java_66_real_switch_automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enterthe browser");
        String browser = scanner.next();
        browser =browser.toLowerCase();
        browser =browser.toUpperCase();

        switch (browser) {
            case "CHROME":
                System.out.println("starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("starting the firefox");
                System.out.println("Tc1");
                System.out.println("tc2");
                break;
            default:
            System.out.println("wrong browser");

        }
    }
}
