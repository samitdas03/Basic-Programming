package oops.exceptionHandling;

public class TryCatch {

    public static void main(String[] args) {
        
        try {
            int a = 5;
            int b = 0;

            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage() + " occoured, please check your code.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index should be in the range of 0 to (size - 1) of array.");
        } catch(IllegalArgumentException e) {
            System.out.println("check you argument carefully.");
        } finally {
            System.out.println("Sorry for the inconvenience.");
        }

        System.out.println("Very important code, must need to run.");

    }
    
}
