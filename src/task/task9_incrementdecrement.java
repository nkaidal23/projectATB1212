package task;

public class task9_incrementdecrement {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
//line no | i | result of b
//i = 1 , j = 2, k=3
//m =
//i-- == 1 /0
//j-- = 2/1
//k = 3/2
//m = -4

//