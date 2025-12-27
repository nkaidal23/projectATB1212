package JavaBasics_009_forloop;

public class java_76_condittion_evenoddnumber {
    public static void main(String[] args) {
        for (int i=0 ;i<50 ;i++){ //0 to 49 // 50 times
            if (i%2==0){
                System.out.println(i);
            }
            else {
                System.out.println("odd number ->" + i ); // concatination
                //break and continue function can be use continue function is ussed to skip
            }
        }
    }
}
