package outputformatting;

public class Conversion {
    
    public static void main(String[] args) {

        // conversion type

        System.out.printf("%d%n", 10);
        System.out.printf("%f%n", 10.45);
        System.out.printf("%c%n", 'g');
        System.out.printf("%C%n", 'g');
        System.out.printf("%s%n", "hello");
        System.out.printf("%S%n", "hello");
        System.out.printf("%b%n", 5 < 4);
        System.out.printf("%B%n", 5 < 4);
        // System.out.printf("%b%n", null);
        System.out.printf("%b%n", "");
        System.out.printf("%b%n", "shi");


    }
}
