package patterns;
import java.util.Scanner;

public class AdvancedPattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Pattern : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i +1; j++) {
				System.out.print("* ");
			}
			
			for (int k = 1; k <= 2 * i - 1; k++) {                                    // 2 + 4(i - 1) = 4i - 2 = 2(2i - 1)
				System.out.print("  ");
			}
			
			for (int l = 1; l <= n - i + 1; l++ ) {
				System.out.print("* ");
			}
			
			System.out.println();

		}
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			for (int k = 1; k <= 2 * (n - i) + 1; k++) {                              // 4(n - 1) + 2 - 4(i - 1)
				System.out.print("  ");
			}
			
			for (int l = 1; l <= i; l++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		
		sc.close();
		

	}

}
