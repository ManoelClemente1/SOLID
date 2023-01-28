package OpenClosedPrinciple;

import OpenClosedPrinciple.vehicles.Car;
import OpenClosedPrinciple.vehicles.Motorcycle;

public class Ocp {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

        typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
          Car car = new Car("Red", "2022", 2.0, 4);
        }else if(typeVehicle == TypeVehicle.MOTORCYCLE){
            Motorcycle motorcycle = new Motorcycle("Black", "2023", 600);

        }

    }
}

