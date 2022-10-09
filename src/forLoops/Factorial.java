package forLoops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Factorial of : "); 
		int factorialOf = sc.nextInt();
		
		long result = 1;
		
		if (factorialOf < 0) {
			System.out.println("Please enter a valit number");
		} else if (factorialOf == 0) {
			result = 1;
			System.out.println("Factorial of " + factorialOf + " is " + result);
		} else {
			
			for (int i = factorialOf; i > 0; i--) {
				
				result *= i;
				
			}
			
			System.out.println("Factorial of " + factorialOf + " is " + result);
			
		}
		
		sc.close();
		
	}

}
