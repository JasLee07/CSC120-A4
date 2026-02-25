import java.util.ArrayList;
public class Car implements CarRequirements {
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    public Car(ArrayList<Passenger> passengersOnBoard, int maxCapacity){
    this.passengersOnBoard = passengersOnBoard;
    this.maxCapacity = maxCapacity;    
    }

    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
        return maxCapacity-passengersOnBoard.size();
    }
    
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