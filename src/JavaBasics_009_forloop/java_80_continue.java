package JavaBasics_009_forloop;

public class java_80_continue {
    public static void main(String[] args) {
        for (int i=0 ; i<20 ; i++){
            if (i==5){

                continue;

            }
            System.out.println(i);
            //it will skip 5
        }
    }
}
