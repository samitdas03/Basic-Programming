package outputformatting;

public class Precision {

    public static void main(String[] args) {

        double num = 12.3456789;

        System.out.printf("%f%n", num);
        System.out.printf("%.0f%n", num);
        System.out.printf("%.1f%n", num);
        System.out.printf("%.2f%n", num);
        System.out.printf("%.3f%n", num);
        System.out.printf("%.4f%n", num);
        System.out.printf("%.5f%n", num);
        System.out.printf("%.6f%n", num);
        System.out.printf("%.7f%n", num);
        System.out.printf("%.8f%n", num);

        System.out.println();

        String str = "Hello";

        System.out.printf("%.3s%n", str);
        System.out.printf("%.3b%n", true);


    }
    
}
