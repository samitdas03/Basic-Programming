package oops;

public class Method { 

    public static void main (String[] args) {

        int result1 = maxOf(34, 45);
        double result2 = maxOf(4.3, 8.9);
        double result3 = maxOf(44, 89.5, 54.98);
        System.out.println(result1 + "\n" + result2 + "\n" + result3);

        sayHi();


  
    }

    static int maxOf (int a, int b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    static void sayHi () {
        System.out.println("Hi");
    }

    static double maxOf(double a, double b) {                               // method overloading
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double maxOf(double a, double b, double c) {                     // method overloading
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }  
    }
    

}
