package JavaBasics_04_Operator;

public class java_40_narrowing {
    public static void main(String[] args) {
        int val = 300;
       // byte b = val;//narrowing implicit telling jVM to do it //JVM dataloss will be thr
        byte b1= (byte) val;//narrowing explicit JVM to do it
        System.out.println(b1);

        //int 300 = 30 bits of memory;
       // 1 byte = 8 bit 0f memory
        //00101100. = 44





    }
}
