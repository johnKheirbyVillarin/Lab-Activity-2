public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Ford", "Mustang Mach 1", 1969, 2);
        vehicle.displayInfo();

        System.out.println();


        vehicle = new Truck("Volvo", "Iron Knight", 2017, 2400);
        vehicle.displayInfo();

        System.out.println();

  
        vehicle = new Motorcycle("Honda", "CB650R", 2024, "649cc inline-4");
        vehicle.displayInfo();

        System.out.println();


        System.out.println("\n=== 2. Method Parameter ===");

        vehicle = new Car("Ford", "Mustang Mach 1", 1969, 2);
        printDetails(vehicle);

        System.out.println();

        vehicle = new Truck("Volvo", "Iron Knight", 2017, 2400);
        printDetails(vehicle);

        System.out.println();

        vehicle = new Motorcycle("Honda", "CB650R", 2024, "649cc inline-4");
        printDetails(vehicle);

        System.out.println();


        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Ford", "Mustang Mach 1", 1969, 2);
        vehicles[1] = new Truck("Volvo", "Iron Knight", 2017, 2400);
        vehicles[2] = new Motorcycle("Honda", "CB650R", 2024, "649cc inline-4");

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}
