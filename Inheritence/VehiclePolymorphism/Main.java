package Inheritence.VehiclePolymorphism;

public class Main {
    public static void main(String[] args) {
        Super[] vehicle=new Super[2];
        vehicle[0]=new Car("Honda","Civic");
        vehicle[1]=new Moto("Susuki","Dream 2024");
        for (int i = 0; i < vehicle.length; i++) {
            vehicle[i].drive();
        }
    }
}
