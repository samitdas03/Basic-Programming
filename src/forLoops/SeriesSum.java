package forLoops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inverse sum upto : ");
		int number = sc.nextInt();
		
		double sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum += (double)1 / (double)i;
		}
		
		System.out.println("Total sum = " + sum);

		sc.close();

	}

}
