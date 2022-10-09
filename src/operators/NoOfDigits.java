package operators;
import java.util.Scanner;


public class NoOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		int noOfDigits = (int)Math.log10(number) + 1;
		
		System.out.println("Number of digits in the number is : " + noOfDigits);

		
		sc.close();
		
	}

}
