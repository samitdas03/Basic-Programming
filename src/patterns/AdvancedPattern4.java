package patterns;
import java.util.Scanner;


public class AdvancedPattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the pattern : ");
		int n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("*");
		}
		
		for (int i = 2; i <= (n - 1); i++) {
			
			System.out.print("* ");
			
			for (int j = 1; j <= (i - 2); j++) {
				System.out.print("  ");
			}
			
			System.out.println("*");
		}
		
		if (n != 1) {
			for (int i = 1; i <= n; i++) {
				System.out.print("* ");
			}
		}
		
		
		sc.close();
		
	}

}
