public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2015, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500", 2020, 500);
        Truck truck = new Truck("Isuzu", "Giga", 2018, 12.5);
        Printer printer = new Printer();

        Serviceable[] serviceables = {car, motorcycle, truck, printer};

        for (Serviceable item : serviceables) {
            performService(item);
        }

        System.out.println();

        Vehicle[] garage = {car, motorcycle, truck};

        for (Vehicle vehicle : garage) {
            vehicle.displayInfo();
            vehicle.moveForward();
            System.out.println();
        }
    }
}
