package outputformatting;

public class Flag {

    public static void main(String[] args) {

        // '+' flag

        System.out.printf("%+d%n", 123);
        System.out.printf("%+d%n", -123);
        System.out.printf("%+23f%n", 10.5);
        System.out.printf("%+8.2f%n", -10.5);

        // space flag

        System.out.printf("% d%n", 123);
        System.out.printf("%d%n", -123);
        System.out.printf("% .3f%n", 123.456);
        System.out.printf("% 9.3f%n", 123.456);
        System.out.printf("% .3f%n", -123.456);

        // '0' flag
        
        //System.out.printf("%0d%n", 123);                    error as the 0 flag need a specified width

        System.out.printf("%06d%n", 123);
        System.out.printf("%06d%n", -123);
        System.out.printf("%07.2f%n", 123.12);

        // ',' flag

        System.out.printf("%,d%n", 123);
        System.out.printf("%,d%n", -1234);
        System.out.printf("%,f%n", 1234.12);
        System.out.printf("%,.2f%n", 1234.12);
        System.out.printf("%,8.2f%n", 1234.12);
        System.out.printf("%,010.3f%n", 1234.12);
        System.out.printf("%,020f%n", 1234.12);
        

        

        

        

    }
    
}
