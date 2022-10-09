package roughCode;

public class WrapperClass {

    public static void main(String[] args) {
        
        Integer x1 = new Integer(1000);
        int x2 = 1000;
        System.out.println(x1 == x2);


        int a1 = 1000;
        Integer a2 = a1;                        // Auto-boxing
        int a3 = a2;                            // Auto-unboxing
        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        System.out.println(a1 == a3);

        System.out.println(a2 == x2);
        System.out.println(a2 == x1);

        a1 = 2000;
        System.out.println(a2);
        a2 = 3000;
        System.out.println(a3);

    }
    
}
