import java.util.ArrayList;
import java.util.List;

public class Train implements TrainRequirements{
    private Engine engine;
    private List<Car> CarList;
    public int nCars;
    public int passengerCapacity;
    private int maxCapacity;

// Constructor that initalizates everything
public Train(FuelType fuelType, double fuelCapacity, double currentFuellevel, int nCars, int passengerCapacity){
    this.engine = new Engine(fuelType, currentFuellevel, fuelCapacity);
    this.nCars = nCars;
    this.passengerCapacity = passengerCapacity;
    this.CarList = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++){
            ArrayList<Passenger> passengersInCar = new ArrayList<>();
            this.CarList.add(new Car (passengersInCar, passengerCapacity));
        }
}

public Engine getEngine(){
    return this.engine;
}

public Car getCar(int i){
    return this.CarList.get(i);
    
}

public int getMaxCapacity(){
    return this.nCars * passengerCapacity;
}

public int seatsRemaining(){        
    int seatsRemaining = 0;
    for (Car car : CarList) {
        seatsRemaining += car.seatsRemaining();
    }
    return seatsRemaining;
}

public void printManifest(){
    for (Car car : CarList) {
        car.printManifest();
    }
}

public static void main(String[] args) {
    Train myTrain = new Train(FuelType.STEAM, 100, 70, 4, 50);
    Passenger john = new Passenger("John");
    john.boardCar(myTrain.getCar(2));
    myTrain.engine.go();
    myTrain.engine.refuel();
    myTrain.engine.getCurrentFuel();
    myTrain.printManifest();
}
}