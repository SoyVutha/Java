package Algorithms.Inheritence.ShapeHierarchy;

public class Rectangle extends Shape {
    private  double lenght;private double width;
    //constructor
    public Rectangle(double lenght, double width) {this.lenght=lenght;this.width=width;}
    //getter
    public double getLenght(){return this.lenght;}
    public double getWidth(){return this.width;}
    //setter
    public void setLenght(double length){this.lenght=length;}
    public void setWidth(double width){this.width=width;}

    //method
    public double calculateArea(){
        return this.lenght*this.width;
    }
    public double calculatePerimeter(){
        return 2*(this.lenght+this.width);
    }
}
