package patterns;
import java.util.Scanner;

public class AdvancedPattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Pattern : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			System.out.print(i + " ");
			
			for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
				System.out.print("0 ");
			}
			
			if (i > 1) {
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		
		
		sc.close();

	}

}
