package task;

public class task7_incrementdecrement {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;

        System.out.println(i);
    }
}

//Line no | a | result of b
// 5 | 11 | NA
// i++ = 11 , 12 ==11
//++i = 12+1 = 13
// 24