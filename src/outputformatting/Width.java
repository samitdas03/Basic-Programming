package outputformatting;

public class Width {

    public static void main(String[] args) {

        System.out.printf("%8d%n", 123);
        System.out.printf("%4d%5d%n", 123, 456);
        System.out.printf("%10.5f%n", 123.45);

        System.out.printf("%-7d%n", 123);
        System.out.printf("%-6s%4d%n", "num =", 456);

        System.out.println();

        String name = "Samit";
        int age = 17;
        double gpa = 9.5;

        System.out.printf("%-7s%7s%n", "Name =", name);
        System.out.printf("%-7s%7d%n", "Age =", age);
        System.out.printf("%-7s%7.2f%n", "GPA =", gpa);

    }
    
}
