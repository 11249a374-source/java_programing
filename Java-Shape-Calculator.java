import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Choose a shape: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                if (r <= 0) {
                    System.out.println("Radius must be positive.");
                    break;
                }

                Circle c = new Circle(r);
                System.out.printf("Area: %.2f%n", c.area());
                System.out.printf("Perimeter: %.2f%n", c.perimeter());
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();

                if (l <= 0 || b <= 0) {
                    System.out.println("Dimensions must be positive.");
                    break;
                }

                Rectangle rect = new Rectangle(l, b);
                System.out.printf("Area: %.2f%n", rect.area());
                System.out.printf("Perimeter: %.2f%n", rect.perimeter());
                break;

            case 3:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();

                if (s <= 0) {
                    System.out.println("Side must be positive.");
                    break;
                }

                Square sq = new Square(s);
                System.out.printf("Area: %.2f%n", sq.area());
                System.out.printf("Perimeter: %.2f%n", sq.perimeter());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
