package forLoops;
import java.util.Scanner;

public class FabonacciNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print Fibonacci Numbers upto : ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int result = 0;
		
		
		if (n < 1) {
			
			System.out.print("Please enter a valid number");
			
		} else if (n == 1) {
			
			System.out.print("Fibonacci series : " + a);
			
		} else if (n == 2) {
			
			System.out.print("Fibonacci series : " + a + ", " + b);
			
		} else {
			
			System.out.print("Fibonacci series : ");
			System.out.print(a + ", " + b);
			
			for (int i = 3; i <= n; i++) {
				
				result = a + b;
				System.out.print(", " + result);
				
				int temp = b;
				b = result;
				a = temp; 
				
			}
			
		}
		
		System.out.println();
		sc.close();
		
		

	}

}
