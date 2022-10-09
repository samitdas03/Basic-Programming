package roughCode;

public class experiment {

    public static void main(String[] args) {
        
        int result = factorial(3);
        System.out.println(result);

    }

    private static int factorial(int number){
        if (number >= 1) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }    

}
