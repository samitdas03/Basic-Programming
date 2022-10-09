package patterns;
import java.util.Scanner;


public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the pattern : ");
		int size = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= size; i++) {
			
			for (int j = 1; j <= (size - i + 1); j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
