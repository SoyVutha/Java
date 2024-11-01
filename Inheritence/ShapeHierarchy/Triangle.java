package Algorithms.Inheritence.ShapeHierarchy;

public class Triangle extends Shape {
    private double A;private double B;private double C;
    //constructor
    public Triangle(double A, double B, double C) {this.A=A;this.B=B;this.C=C;}
    //getter 
    public double getA() {return A;}
    public double getB() {return B;}
    public double getC() {return C;}
    //setter
    public void setA(double A) {this.A = A;}
    public void setB(double B) {this.B = B;}
    public void setC(double C) {this.C = C;}
    
    //method
    public double calculateArea(){
         return (this.A + this.B + this.C) / 2;
    }
    public double calculatePerimeter(){
        return this.A + this.B + this.C;
    }
}
