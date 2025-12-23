package task;
public class task5 {
    // nested ternary operator: find max between three numbers
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 13;
        int n3 = 10;
        int max = (n1 > n2)
                ? (n1 > n3 ? n1 : n3)
                : (n2 > n3 ? n2 : n3);
        System.out.println(max);
    }
}
