package oops;

class Laptop {
    String company, model, os;
    int ram, ssd, hdd;
    float dimension;
    boolean isTouchScreen;

    public void boot() {
        System.out.println(company + " " + model + " " + "is booting up");
    }

    public void description() {
        System.out.println("Laptop : " + company + " " + model);
        System.out.println("Operating System : " + os);
        System.out.println("Storage : " + hdd + " GB HDD " + ssd + " GB SSD");
        System.out.println("Ram : " + ram + " GB");
        System.out.println("Screen size : " + dimension + " inch");
        
        if (isTouchScreen) {
            System.out.println("Touch Screen support : YES");
        } else {
            System.out.println("Touch Screen support : NO");
        }

    }

}

public class LaptopClass {

    public static void main(String[] args) {

        Laptop MacBook = new Laptop();
        // Laptop SurfaceLaptop = new Laptop();

        // MacBook states

        MacBook.company = "Apple";
        MacBook.model = "MacBook Pro";
        MacBook.os = "MacOS";
        MacBook.ram = 16;
        MacBook.ssd = 512;
        MacBook.dimension = 13.3f;
        MacBook.isTouchScreen = false;

        // MacBook behaviours or methods

        MacBook.boot();
        MacBook.description();

    }
    
}
