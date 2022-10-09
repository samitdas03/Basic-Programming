package forLoops;
import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number is : ");
		int x = sc.nextInt();
		
		System.out.print("To the power : ");
		int y = sc.nextInt();
		
		double result = 1;
		
		if (y < 0) {
			
			if (x == 0) {
				System.out.println("Ans : Infinity");
			} else {
			
				for (int i = 0; i > y; i--) {
					result /= x;
				}
				
				System.out.println("Ans : " + result);
			
			}
			
		} else if (y == 0) {

			if (x == 0) {
				System.out.println("Ans : " + "Undefine"); 
			} else {
				System.out.println("Ans: " + 1);
			}
			
		} else {
		    
			for (int i = 0; i < y; i++) {
				result *= x;
			}
			
			System.out.println("Ans : " + result);
			
		}

		sc.close();

	}

}
