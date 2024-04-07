public class Rectangle extends Figure implements Printing{

    double a;
    double b;

    //constructor with the figure's parameters
    public Rectangle (double a, double b){
        if (a<=0 || b<=0){
            System.out.println("Entered parameters are incorrect");
            throw new IllegalArgumentException("Invalid data");
        }
            this.a = a;
            this.b = b;
    }

    public double calculatePerimeter() {
        double perimeter = 2*(a+b);
        return perimeter;
    }

    public double calculateArea(){
        double area = a*b;
        return area;
    }

    public String toString() {
        return "Rectangle"; //return the name of class (base of 3D figure)
    }

    public void print(){
        System.out.println("Entered rectangle's sides: " + a + "i " + b );
        System.out.println("Perimeter of the figure is: " + calculatePerimeter());
        System.out.println("Area of the figure is: " + calculateArea());
    }

}
