package JavaBasics_14_StringBuildervsStringBuffer;

public class java_97_IQ2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("JAVA");
        sb.append(" Programming");
        System.out.println(sb);

        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);

    }
}
