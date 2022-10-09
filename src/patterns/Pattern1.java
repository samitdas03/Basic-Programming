package patterns;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of square : ");
		int length = sc.nextInt();
		
		
		for (int i = 0; i < length; i++) {
			
			for (int j = 0; j < length; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		sc.close();
		
	}

}
