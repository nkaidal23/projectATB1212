package task;

public class task3_Evenoddternaryoperator {
    //nested ternary operator = use number if it is even or odd
    public static void main(String[] args) {
        int X = 11 ;
        String even_odd = ( X % 2 == 0 ) ? "Even" : "odd" ;
        System.out.println(even_odd);
    }
}
