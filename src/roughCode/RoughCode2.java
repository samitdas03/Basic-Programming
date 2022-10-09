package roughCode;

public class RoughCode2 {

    public static void main(String[] args) {

        byte myByte = 49;
        short myShort = 78;
        char myChar = (char)myByte;

        System.out.println((char)myShort);
        System.out.println((byte)'%');
        System.out.println(myChar);


        int a = 5;
        a++;
        System.out.println(a);

        int b = 10;
        // int c = b++;
        int c = ++b;

        System.out.println(c + " " + b);



    }
    
}
