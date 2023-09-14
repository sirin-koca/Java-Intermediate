package java_features;

public class StringFormat {
    public static void main(String[] args) {

        // Example1:
        double dVal = 123.4567;
        String formattedString = String.format("%.2f", dVal);
        System.out.println(formattedString);  // Outputs: 123.46

        // Example2:
        int iValue = 123;
        double dValue = 123.4567;
        System.out.printf("Integer: %d, Double: %.2f", iValue, dValue);
        // Outputs: Integer: 123, Double: 123.46

        // Example3;
        int num1 = 5;
        int num2= 9;
        double div = (double) num1 / num2;
        System.out.printf("\nResult: " + "%.2f", div); // The syntax is: printf("%.2f", variabelname)

    }
}

