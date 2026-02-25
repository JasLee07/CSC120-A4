class Engine implements EngineRequirements{
    
    private FuelType fuelType;
    private double currentFuellevel;
    private double maxFuellevel;

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
        this.currentFuellevel = this.maxFuellevel;
        
    }

    public Boolean go(){
        this.currentFuellevel = currentFuellevel -1;
        System.out.println("You have this much fuel left: " + currentFuellevel);
        if (currentFuellevel > 0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 75.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
}
}