package forLoops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		boolean lastIfRun = true;
		
		
		if (number < 0) {
			
			System.out.println("Please enter a positive integer");
			
		} else if (number == 0 || number == 1) {
			
			System.out.println(number + "is not a Prime Number");
			
		} else {
			
			for (int i = 2; i*i <= number; i++) {
				
				int result = number % i;
				if (result == 0) {
					
					lastIfRun = false;
					System.out.println(number + " is not a Prime Number");
					System.out.println(number + " is devided by " + i);
					break;
				}	
			}	
		}
		
		if (lastIfRun && number > 0) {
			System.out.println(number + " is a Prime Number");
		}

		sc.close();
		
		
	}
}
