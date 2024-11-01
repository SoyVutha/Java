package Inheritence.VehiclePolymorphism;

public class Super {
    public  String make;public String model;
    public Super(String make, String model) {this.make=make;this.model=model;}
    //getter
    public String getMake() {return make;}
    public String getModel() {return model;}
    //setter
    public void setMake(String make) {this.make = make;}
    public void setModel(String make) {this.model = make;}
    //method
    public void drive(){
        System.out.println("Driving the vehicle");
    }


}
