public class ThreeDim implements Printing{

    double h;       //height
    Figure base;    //base

    public ThreeDim(double h, Figure base){
        if(h<=0){
            System.out.println("Entered parameters are incorrect");
            throw new IllegalArgumentException("Invalid data");
        }
        this.h = h;
        this.base = base;
    }

    public double calculateArea(){
        double pp = base.calculateArea();               //base area
        double pb = h*base.calculatePerimeter();        //side's area
        double pc = (2*pp)+pb;                          //area of the whole figure
        return pc;
    }

    public double calculateVolume(){
        double volume = h*base.calculateArea();
        return volume;
    }

    public void print(){
        System.out.println("Entered base of the prism: " + base.toString() );
        System.out.println("Entered height of the prism: " + h );
        System.out.println("Area of the prism is: " + calculateArea());
        System.out.println("Volume of the prism is: " + calculateVolume());
    }

}
