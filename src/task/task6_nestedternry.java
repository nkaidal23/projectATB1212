package task;

public class task6_nestedternry {
    public static void main(String[] args) {
        //nested ternary operator i am adult minor or senior
        //condition : age < 18 then i am minor adult or senior
        //age>65 senior
       // age between 18 to 65 then adult
//condition1 ? result : condition2 ? results2 : results3
        int age = 9;
        String category = (age < 18) ? "minor" : (age < 65) ? "Adult" : "Senior citizen";
        System.out.println(category);

    }
}
