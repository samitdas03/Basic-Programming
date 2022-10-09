package forLoops;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Sum from 1 up to : ");
//		int number = sc.nextInt();
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//		}
//		
//		System.out.print("Sum = " + sum);
		
		
		System.out.print("Multiplicative table of : ");
		int tableOf = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			int result = tableOf * i;
			System.out.println(tableOf + " * " + i + " = " + result);
			
		}

		sc.close();

	}

}
