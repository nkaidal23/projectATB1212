package JavaBasics_007_conditionloops;

public class java_60_ifconditionalstatement {
    public static void main(String[] args) {
        //if conditional statement - decision making in program
        //basic syntax -
        //o/p should be boolean
//it will result in true or false
        //result datatype - boolean

        int age = Integer.parseInt(args[0]);
        if (age>18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you cant vote");
        }
    }
}

