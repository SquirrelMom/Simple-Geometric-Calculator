public class Diamond extends Figure implements Printing {

    double a;
    double h;

    public Diamond(double a, double h){
        if(a<=0 || h<=0){
            System.out.println("Entered parameters are incorrect");
            throw new IllegalArgumentException("Invalid data");
        }
        this.a = a;
        this.h = h;
    }

    public double calculatePerimeter() {
        double perimeter = 4*a;
        return perimeter;
    }

    public double calculateArea(){
        double area = a*h;
        return area;
    }

    public String toString() {
        return "Diamond"; //return the name of class (base of 3D figure)
    }

    public void print(){
        System.out.println("Entered diamond's side: " + a );
        System.out.println("Entered diamond's height: " + h );
        System.out.println("Perimeter of the figure is: " + calculatePerimeter());
        System.out.println("Area of the figure is: " + calculateArea());
    }

}
