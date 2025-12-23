package task;

public class java7_nested_ternary {
    public static void main(String[] args) {
                int age = 45;

                String category = (age < 18)
                        ? "Minor"
                        : (age < 60)
                        ? "Adult"
                        : "Senior Citizen";

                System.out.println(category);
            }
        }



