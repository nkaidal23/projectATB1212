package task;

public class task8_incrementdecremnt {
    public static void main(String[] args) {

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        // a= 11 , b= 22
        //  c = a + b + a++ + b++ + ++a + ++b;
        // 33 + a++ =33+11 =44 now 11 / 12=a
        //b++ = 22 + 44 = 66/ now 22 will be 23=b
        // ++a = 12 = 13
        //66+13=79
        //++b = 23 =24
        //79+24 =103=c

        //24
        //48
        //206

    }
}
