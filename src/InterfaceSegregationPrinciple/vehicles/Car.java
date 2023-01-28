package InterfaceSegregationPrinciple.vehicles;

public class Car implements IVehicle, IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){
        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Creating a "+ color + " car with interface " + year + " " + engine + " with " + seats + " seats");
        startVehicle();
    }


    @Override
    public void startVehicle() {
        System.out.println("Starting engine...");
    }
}
