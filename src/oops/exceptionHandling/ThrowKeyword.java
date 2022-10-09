package oops.exceptionHandling;

public class ThrowKeyword {

    public static void main(String[] args) {

        fun1();
        
    }

    static void fun1() {
        int a = 10;
        int b = 5;
        int c = a / b;
        System.out.println(c);

        boolean isDenger = true;

        if (isDenger) {
            throw new ArrayIndexOutOfBoundsException("danger was coming");
        }
    }
    
}
