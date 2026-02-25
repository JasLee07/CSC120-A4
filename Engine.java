class Engine implements EngineRequirements{
    
    // `FuelType` attribute to indicate what type of fuel it uses, and `double`s to store the current and maximum fuel levels
    private FuelType fuelType;
    private double currentFuellevel;
    private double maxFuellevel;
    
    // a constructor, which takes in initial values for the attributes named above and sets them appropriately
    public Engine(FuelType fuelType, double currentFuellevel, double maxFuellevel){
        this.fuelType = fuelType;
        this.currentFuellevel = currentFuellevel;
        this.maxFuellevel = maxFuellevel;
    }
    
    public FuelType getFuelType(){
        return fuelType;
    }

    public double getMaxFuel(){
        return maxFuellevel;
    }

    public double getCurrentFuel(){
        return currentFuellevel;
    }

    public void refuel(){
        System.out.println("Refueling...");
        this.currentFuellevel = this.maxFuellevel;
    }

    // a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), 
    //and return `True` if the fuel level is above 0 and `False` otherwise.
    public Boolean go(){
        this.currentFuellevel = currentFuellevel -1;
        System.out.println("You have this much fuel left: " + currentFuellevel);
        if (currentFuellevel > 0){
            return true;
        } else{
            return false;
        }
    }
    
    /* public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 25.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        myEngine.refuel();
        System.out.println("You are now at 100%");
    */
}
