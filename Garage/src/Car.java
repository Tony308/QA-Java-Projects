public class Car extends Vehicle {

    private int passengers;
    private String engine;
    private double engineSize;

    Car (String id, String type, String make, String model, double engineSize,
         String engine, int passengers) {
        super(id, type, make, model);
        this.engineSize = engineSize;
        this.engine = engine;
        this.passengers = passengers;
    }

    public int getPassengers() {return  this.passengers;}

    public void setPassengers(int passengers) {this.passengers = passengers;}

    public String getEngine() {return this.engine;}

    public void setEngine(String engine) {this.engine = engine;}

    public double getEngineSize() { return this.engineSize;}

    public void setEngineSize(double engineSize) {this.engineSize = engineSize;}

}
