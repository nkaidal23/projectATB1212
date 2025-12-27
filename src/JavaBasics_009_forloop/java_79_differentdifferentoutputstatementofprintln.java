package JavaBasics_009_forloop;

public class java_79_differentdifferentoutputstatementofprintln {
    public static void main(String[] args) {
        for (int i = 0 ; i<50 ; i++){
            //soplnop - 0 , 1 ,2 ,3 ,4 ,5
            if (i==5){
                //sopln - 5
                break;
            }
            System.out.println(i); // sopln - 01234
        }
        //all sopln statements gives different output
    }
}
