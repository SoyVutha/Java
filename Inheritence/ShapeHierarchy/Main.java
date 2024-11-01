package Algorithms.Inheritence.ShapeHierarchy;

public class Main {
    public static void main(String[] args){
        Shape[] shape=new Shape[3];
        shape[0]=new Circle(5);
        shape[1]=new Rectangle(5.4,7.8);
        shape[2]=new Triangle(5,4,3);
        for (int i = 0; i < shape.length; i++) 
        {
            System.out.println("Area : "+shape[i].calculateArea());
            System.out.println("Perimeter :"+shape[i].calculatePerimeter());
        }
    }   
}
