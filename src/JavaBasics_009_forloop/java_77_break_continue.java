package JavaBasics_009_forloop;

public class java_77_break_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println(i);
                break;
            } else {
                System.out.println("end");
            }
        }
    }
}
