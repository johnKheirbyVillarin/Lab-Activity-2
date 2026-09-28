public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Corolla", 1995);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2010);
        Vehicle v3 = new Vehicle("Tesla", "Model 3", 2023);

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

