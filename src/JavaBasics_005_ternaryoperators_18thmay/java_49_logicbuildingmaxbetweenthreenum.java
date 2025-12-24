package JavaBasics_005_ternaryoperators_18thmay;

public class java_49_logicbuildingmaxbetweenthreenum {
    public static void main(String[] args) {
        //1.input-output - datatypes
        //2.rough logic - interviewer side by side
        //3.writing the logic and presenting the solution
        //4.optimization and discusssion
        //5.edgecase and extra discussion

        //1. input - int
        // output - int / string = max number / or we ccan give is message  with max number
        int num1 = 10;
        int num2 = 23;
        int num3 = -9;
        int max = (num1 > num2) ? (num1>num3) ? num1 : num3 :(num2 > num3) ? num2 : num3;
        System.out.println(max);
        //2 Rough logic -- n1 > n2 && n1 > n3 ==n1
        //n2 > n3 && n2 >n1 == n2
        //n3
        //3 dry run program



    }
}
