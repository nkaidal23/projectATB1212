package JavaBasics_010_Whileloop;

import java.util.Random;
import java.util.Scanner;

public class java_84_whileguessinggame {
    public static void main(String[] args) {
        //guess number between 1 to 100;
        //n-50
        //g-70 greater than 40 ;guessing 10 less than 40
        //how many times guessing
        Random random = new Random();
        int numbertoguess = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("guess number between 1 to 100");
        int guess;
        int attempts=0;

        while(true){
            guess=scanner.nextInt();
            attempts++;
                    if(guess<numbertoguess) {
                        System.out.println("toolowtryagain");
                    }else if(guess>numbertoguess){
                            System.out.println("toohightryagain");
                        }
                        else {
                System.out.println("correct " +attempts);
                break;
                    }
        }
    }
}
