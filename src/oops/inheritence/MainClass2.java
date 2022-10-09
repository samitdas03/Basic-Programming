package oops.inheritence;

public class MainClass2 {

    public static void main(String[] args) {

        // UPCASTING

        Teacher t2 = new Teacher();         // sub-class instance

        Person p1 = t2;                     // implicit casting, it's fine since Teacher "is-a" Person


        // DOWNCASTING

        Singer s1 = new Singer();
        Person p2 = s1;

        Singer s2 = (Singer) p2;            // explicit casting, works fine as person "p2" is actually of type Singer



        boolean boo = t2 instanceof Teacher;
        System.out.println(boo);
        System.out.println(t2 instanceof Person);

        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Teacher);

        System.out.println(p2 instanceof Singer);
        System.out.println(p2 instanceof Person);

        System.out.println(s2 instanceof Singer);
        System.out.println(s2 instanceof Person);




        Teacher xyz = new Teacher();
        
        System.out.println(xyz instanceof Person);



    }
    
}
