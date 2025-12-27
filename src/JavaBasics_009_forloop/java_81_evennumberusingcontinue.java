package JavaBasics_009_forloop;

public class java_81_evennumberusingcontinue {
    public static void main(String[] args) {
        for (int i =0 ; i<=50 ; i++){
            if (i%2==0) {
                continue;
            }else{
                System.out.println("odd number"+i);
            }
        }
    }
}
