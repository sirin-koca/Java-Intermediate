// Only one public class
public class Circle {

    // A class field
    public static final double PI = 3.14159;

    // An instance field:
    public double r;

    // A class method:
    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }

    // Two instance methods:
    // they operate on the instance fields of an object
    public double area(double r) {
        return PI * r * r;
    }

    // Compute the circumference of the circle
    public double circumference(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {

        Circle myCircle = new Circle();

        double area = myCircle.area(3);
        System.out.printf("%.2f%n", area);  // Decimal format 2 points after comma: print(String.format("%.2f", area));

        double circumference = myCircle.circumference(4);
        System.out.printf("%.2f%n", circumference);

        double radians = radiansToDegrees(5);
        System.out.printf("%.2f%n", radians);
    }
}