package whileLoops;
import java.util.Scanner;


public class WhileLoop_SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		int temp = number;
		int sum = 0;
		
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		
		System.out.println("The sum of the digits of the number = " + sum);
		
		sc.close();

	}

}
