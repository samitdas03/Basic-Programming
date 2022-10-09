package roughCode;
  //import java.util.Scanner;

import java.util.Arrays;

public class RoughCode1 {

	public static void main(String[] args) {
		
	/*	short a = 2;
		char x = (char)a;
		
		
		float myFloat = 3.43f;
		int myInt = (int)myFloat;
		
		
		System.out.println(myInt);
		
		*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("What is your name ?");
//		String name = sc.nextLine();
//		
//		
//		 
//		System.out.println("My name is " + name);
		
		
//		char a = 'p';
//		int b = (int)a;
//		
//		System.out.println(b);
		
		float a = 1 % 2;
        System.out.println(a);

		System.out.println(2^2);

		System.out.println(Math.PI);

		int arr[] = {12, 4, 21, 17, 15};
		System.out.println(median(arr, 5));

		
	}

	public static int median(int A[],int N) {
      
		Arrays.sort(A);
		int median = 0;
		int x = N/2;
		
		if(N % 2 == 0) {
			median = (A[x] + A[x + 1]) / 2;
		} else {
			median = A[x];
		}
		return median;
	}

}