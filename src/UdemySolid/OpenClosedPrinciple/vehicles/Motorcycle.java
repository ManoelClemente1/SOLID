package UdemySolid.OpenClosedPrinciple.vehicles;

public class Motorcycle extends Vehicle{

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        configureMotorcycle();
    }

    void configureMotorcycle(){
        System.out.println("Creating a " + color + " motorcycle " + year + " " + engine + " engine capacity");
        startVehicle();
    }
}
