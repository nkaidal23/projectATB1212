package JavaBasics_005_ternaryoperators_18thmay;

public class java_48_logicbuilding_evenodd {
    //1.input-output - datatypes
    //2.rough logic - interviewer side by side
    //3.writing the logic and presenting the solution
    //4.optimization and discusssion
    //5.edgecase and extra discussion

    public static void main(String[] args) {
        //1) even and odd
        //1. input /outputs - dtatypes
        int num = 0 ;
        //input -int ,
        // output - String
        //2. rough logic and brute force , num%2==0 -- even else odd
       //3 writing the logic and presenting the solution
        String result = (num%2==0) ? "even" : "odd" ;
        System.out.println(result);
        //edgecase = decimal/negative input (as user told input is in int)
        //-1/5.4/0 === input


    }
}
