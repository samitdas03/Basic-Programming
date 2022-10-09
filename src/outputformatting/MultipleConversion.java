package outputformatting;

public class MultipleConversion {

    public static void main(String[] args) {

        int num1 = 10;
        int num3 = 30;

        System.out.printf("%d%d%d%n", num1, 20, num3);
        System.out.printf("%d %d %d%n", num1, 20, num3);

        System.out.println();

        int num = 87;
        char per = '%';
        String s = " of all statistics are made up?";
 
        System.out.printf("Did you know, %d%c%s%n", num, per, s);
        System.out.printf("Did you know, %d%%%s%n", num, s);

        System.out.println( );

        String name = "Samit Das";
        int age = 17;
        double gpa = 9.7;

        System.out.printf("Name : %s%nAge : %d%nGPA : %f%n", name, age, gpa);

    }
    
}
