import java.util.ArrayList;
import java.util.List;

public class Train implements TrainRequirements{
    private Engine engine;
    private List<Car> CarList;
// Constructor that initalizates everythign
public Train(FuelType fuelType, double maxFuellevel, double currentFuellevel, int nCars, int passengerCapacity){
    this.engine = new Engine(fuelType, maxFuellevel, currentFuellevel);
    this.CarList = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++){
            this.CarList.add(new Car (passengersOnBoard, passengerCapacity));
        }
}

public Engine getEngine(){
    return engine;
}

public Car getCar(int i){
    return this.CarList.get(i);
    
}
public int getMaxCapacity(){

}



}