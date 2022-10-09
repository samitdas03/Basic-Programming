package whileLoops;
import java.util.Scanner;


public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		int temp = number;
		int digit = 0; 
		int reverseNumber = 0;
		
		while (temp > 0) {
			
			digit = temp % 10;
			temp /= 10;
			reverseNumber = 10 * reverseNumber + digit;
			
		}
		
		if (number == reverseNumber) {
			System.out.println("This is a Pelindrome Number");
		} else {
			System.out.println("This is not a Pelindrome Number");
		}
		
		sc.close();
		
	}

}
