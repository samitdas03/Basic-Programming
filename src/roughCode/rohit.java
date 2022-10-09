package roughCode;
import java.util.Scanner;

public class rohit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        rohit r = new rohit();

        r.fun(st);

    }

    void pall(StringBuilder s, int n) {

        if(n == 0 || n == 1) {
            System.out.println("YES");
            return;
        }

        if(s.charAt(0) == s.charAt(n-1)) {
            s.deleteCharAt(0);
            s.deleteCharAt(n-2);
            pall(s, n-2);
        } else {
            System.out.println("NO");
        }
    }

    void fun(String s) {

        int n = s.length();

        StringBuilder sb = new StringBuilder(s);

        pall(sb, n);
    }
    
}
