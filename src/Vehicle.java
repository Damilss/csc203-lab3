public abstract class Vehicle {

    private String make;
    private String model;
    private int year; 

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /* Set Methods */
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year; 
    }

    /* Get Methods */
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }

}
