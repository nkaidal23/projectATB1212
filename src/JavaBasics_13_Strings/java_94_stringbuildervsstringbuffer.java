package JavaBasics_13_Strings;

public class java_94_stringbuildervsstringbuffer {
    public static void main(String[] args) {
        String name = "ABCDE";
        String name1 =new String("ABCDE");
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('B'));
        System.out.println(name.concat("FGH"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));

        String s1="Sonal";
        System.out.println(s1.indexOf('n'));

        System.out.println(name.replace('B','j'));

        StringBuilder neha = new StringBuilder("SABA");
        System.out.println("neha");

        StringBuilder sb = new StringBuilder("HI");
        System.out.println(sb.toString());
    }

}
