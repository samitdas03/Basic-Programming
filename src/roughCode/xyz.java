package roughCode;



public class xyz {

    static final int MAX;
    static {
        MAX = 123;
    }

    public static void main(String[] args) {

        final int x;
        x = 100;
        System.out.println(x);
        System.out.println(xyz.MAX);

        
        
    }

    static void sorted(String s) {
        
        int i = Integer.parseInt(s);
        
        StringBuilder sb = new StringBuilder();
        
        while(i > 0) {
            sb.append(i % 2);
            i /= 2;
        }
        sb.reverse();
        
        System.out.println(sb);
        
    }


}
    

