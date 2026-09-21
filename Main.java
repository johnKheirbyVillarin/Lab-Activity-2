public class Main {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.model = "Corolla";
        v1.year = 1995;

        Vehicle v2 = new Vehicle();
        v2.brand = "Honda";
        v2.model = "Civic";
        v2.year = 2010;

        Vehicle v3 = new Vehicle();
        v3.brand = "Tesla";
        v3.model = "Model 3";
        v3.year = 2023;

        
        System.out.println("=== Vehicle 1 ===");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println("\n=== Vehicle 2 ===");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        System.out.println("\n=== Vehicle 3 ===");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
    }
}
