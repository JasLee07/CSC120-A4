// an `ArrayList` where it will store the `Passenger`s currently onboard, 
// and an `int` for the `Car`'s maximum capacity
import java.util.ArrayList;
public class Car implements CarRequirements {
    // an `ArrayList` where it will store the `Passenger`s currently onboard, 
    // and an `int` for the `Car`'s maximum capacity
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    //constructor, which takes in an initial value for the `Car`'s maximum capacity 
    //and initializes an appropriately-sized `ArrayList`
    public Car(ArrayList<Passenger> passengersOnBoard, int maxCapacity){
    this.passengersOnBoard = passengersOnBoard;
    this.maxCapacity = maxCapacity;    
    }
    //accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` 
    //that return the maximum capacity and remaining seats, respectively
    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
        return maxCapacity-passengersOnBoard.size();
    }
    
    // `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or 
    // remove a `Passenger` from the `Car` and 
    // return `True` if the operation was successful, and `False` otherwise.
    public Boolean addPassenger(Passenger p){
        if(passengersOnBoard.size() < maxCapacity){
            passengersOnBoard.add(p);
            return true;
        }else{
            System.out.println("Car is full!");
            return false;
        }
        }

        public Boolean removePassenger(Passenger p){
            if(passengersOnBoard.contains(p)){
                passengersOnBoard.remove(p);
                return true;
            } else {
                return false;
            }
        }

        // a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car
        public void printManifest(){
            if (this.seatsRemaining() == this.maxCapacity){
                System.out.println("This car is empty");
            } 
            for(int i = 0; i < passengersOnBoard.size(); i++){
                String person = passengersOnBoard.get(i).getName();
                System.out.println(person);
            }
        }
}