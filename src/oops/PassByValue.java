package oops;

public class PassByValue { 

    public static void main (String[] args) {

        int c = 10; 
        int d = 20;

        swap(c, d);

        System.out.println(c + "\n" + d);


    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    
}



/* Pass By Value : Method parameter value is copied to another variable, and the copied object is passed in the method,
                   so that the actual parameter variable does not change.

   Pass By Refarence: Alias of reference to the actual parameter variable is passed, so that the actual variable does
                      change according to the method.


                      JAVA IS ALWAYS PASS BY VALUE
*/