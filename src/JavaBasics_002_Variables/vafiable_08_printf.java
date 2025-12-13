package JavaBasics_002_Variables;

public class vafiable_08_printf {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(a);
        //System.out.printf("your variable is %d" , a );

        //%d=int,byte,long,short
        //%s - string
        //%f= float,double
        //%b = boolean
        // a will be replaced by %d
        int b = 20 ;
        System.out.printf( "%d + %d",a,b);
    }
}
