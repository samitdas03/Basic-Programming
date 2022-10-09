

// Bitwise operators operate in bits

package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		// three bit numbers
		
		// 6 -> 110
		// 5 -> 101
		// 4 -> 100
		
		int a = 5;
		int b = 6;
		
		int c = a & b;                          // bitwise 'and' operator
		System.out.println(c);
		
		// four bit numbers
		
		// 10 -> 1010
		// 13 -> 1101
		// 15 -> 1111
		
		int d = 10;
		int e = 13;
		 
		int f = d | e;
		System.out.println(f);
		
		
		// Right Shift operation, divides by 2
		// 1101 -> 0110 -> 0011 -> 0001 -> 0000
		
		int g = e >> 1;                        // right shift by 1, 0110, does not change value of e
		int i = e >> 3;                        // right shift by 3, 0001
		System.out.println(g);
		System.out.println(i);
		
		
		// Left Shift operation, multiply by 2
		// 1101 -> 1010 -> 0100 -> 1000
		
		int j = e << 1;                        // left shift by 1, multiply by 2
		int k = e << 2;                        // left shift by 2, multiply by 4
		int l = e << 3;                        // left shift by 3, multiply by 8
		
		System.out.println(j);                  // for use
		System.out.println(k);
		System.out.println(l);
		
		
		
	}

}
