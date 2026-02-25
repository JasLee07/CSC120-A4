public class Passenger implements PassengerRequirements {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // `boardCar(Car c)` can call `c.addPassenger(this)` to board a given `Car`
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    // `getOffCar(Car c)` can call `c.removePassenger(this)` to get off a given `Car`
    public void getOffCar(Car c){
        c.removePassenger(this);
    }
}
