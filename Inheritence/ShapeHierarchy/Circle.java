package Algorithms.Inheritence.ShapeHierarchy;

public class Circle extends Shape {
    private double radius;
    //constructor
    public Circle(double radius){this.radius=radius;}
    //setter
    public void setRadius(double radius){this.radius=radius;}
    //getter
    public double getRadius(){return radius;}
    //methods
    public double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }


}
