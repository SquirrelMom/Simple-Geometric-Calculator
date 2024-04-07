import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, h;
        Figure base;
        System.out.println();
        System.out.println("Welcome to simple 2D and 3D geometric calculator");
        while (true) {
            System.out.println();
            System.out.println("Choose one of the options:");
            System.out.println("1. Calculations for a Triangle");
            System.out.println("2. Calculations for a Rectangle");
            System.out.println("3. Calculations for a Diamond");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    Triangle triangle;
                    System.out.println("2D or 3D figure?");
                    System.out.println("1 2D");
                    System.out.println("0 3D");
                    int furtherChoiceT = scanner.nextInt();

                    System.out.println("Enter the lengths of the triangle's sides': ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    c = scanner.nextInt();
                    triangle = new Triangle(a, b, c);

                    switch (furtherChoiceT) {
                        case 1:
                            triangle.print();
                            break;
                        case 0:
                            base = triangle;
                            System.out.println("Enter the height of the prism: ");
                            h = scanner.nextInt();
                            ThreeDim threeDim;
                            threeDim = new ThreeDim(h, base);
                            threeDim.print();
                            break;
                        default:
                            System.out.println("There is no such option!");
                            break;
                    }
                    break;

                case 2:
                    Rectangle rectangle;
                    System.out.println("2D or 3D figure?");
                    System.out.println("1 2D");
                    System.out.println("0 3D");
                    int furtherChoiceR = scanner.nextInt();

                    System.out.println("Enter the lengths of the rectangle's sides': ");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    rectangle = new Rectangle(a, b);

                    switch (furtherChoiceR) {
                        case 1:
                            rectangle.print();
                            break;
                        case 0:
                            base = rectangle;
                            System.out.println("Enter the height of the prism: ");
                            h = scanner.nextInt();
                            ThreeDim threeDim;
                            threeDim = new ThreeDim(h, base);
                            threeDim.print();
                            break;
                        default:
                            System.out.println("There is no such option!");
                            break;
                    }
                    break;

                case 3:
                    Diamond diamond;
                    System.out.println("2D or 3D figure?");
                    System.out.println("1 2D");
                    System.out.println("0 3D");
                    int furtherChoiceD = scanner.nextInt();

                    System.out.println("Enter the length of the diamond's side's: ");
                    a = scanner.nextInt();
                    System.out.println("Enter the height of the diamond: ");
                    h = scanner.nextInt();
                    diamond = new Diamond(a, h);

                    switch (furtherChoiceD) {
                        case 1:
                            diamond.print();
                            break;
                        case 0:
                            base = diamond;
                            System.out.println("Enter the height of the prism: ");
                            h = scanner.nextInt();
                            ThreeDim threeDim;
                            threeDim = new ThreeDim(h, base);
                            threeDim.print();
                            break;
                        default:
                            System.out.println("There is no such option!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Thanks! See you next time!");
                    return;
                default:
                    System.out.println("There is no such option!");
                    break;
            }

        }
    }
}