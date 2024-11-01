package Inheritence.VehiclePolymorphism;

public class Moto extends Super {
    public Moto(String make,String model){super(make,model);}
     @Override
    public void drive(){
        System.out.println("Driving the vehicle "+this.make+" model : "+this.model);
    }
 
    
}
