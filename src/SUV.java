public class SUV extends Vehicle {
    private int numberOfDoors;
    private int towCapcity;
    private boolean hasAWD;

    public SUV(String make, String model, int  year, int numOfDoors, int towingCapacity, boolean AWD) {
        super(make, model, year);
        this.numberOfDoors = 4;
        this.numberOfDoors = numOfDoors;
        this.towCapcity = towingCapacity;
        this.hasAWD = AWD;
    }
}
