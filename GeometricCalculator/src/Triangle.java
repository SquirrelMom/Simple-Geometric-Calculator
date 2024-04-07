import java.util.Scanner;
import java.lang.Throwable;
public class Triangle extends Figure implements Printing{
double a;
double b;
double c;

//constructor with the figure's parameters
public Triangle (double a, double b, double c){
    //Checking the conditions for triangle construction
    if( a<=0 || b<=0 || c<=0 || ((a+b)<=c) || ((a+c)<=b) || ((b+c)<=a) ){
        System.out.println("Entered parameters are incorrect");
        throw new IllegalArgumentException("Invalid data");
    }
    this.a = a;
    this.b = b;
    this.c = c;
}

    public double calculatePerimeter() {
        double perimeter = a+b+c;
        return perimeter;
    }

public double calculateArea(){
    double p = calculatePerimeter()/2;
    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    return area;
}

    public String toString() {
        return "Triangle"; //return the name of class (base of 3D figure)
    }

    public void print(){
        System.out.println("Entered triangle's sides: " + a + ", " + b + ", " + c );
        System.out.println("Perimeter of the figure is: " + calculatePerimeter());
        System.out.println("Area of the figure is: " + calculateArea());
    }
}
