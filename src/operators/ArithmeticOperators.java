package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 45; 
		
		float c = (float)a / (float)b;
		int d = (a + b) * (a + b);
		int e = b % a;                            // modulo operator for finding remainder
		int f = b++;                              // first assign the previous of b to a then increment the value of b by 1
		int g = ++a;                              // first increment the value of a by 1 then assign it to g
		
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e); 
		System.out.println("value of f is " + f + " value of b is " + b);
		System.out.println("value of g is " + g + " value of a is " + a);
	}

}
