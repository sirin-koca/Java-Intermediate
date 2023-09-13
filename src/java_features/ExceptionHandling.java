package java_features;
/*
An exception is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.
Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.
 */
public class ExceptionHandling {
    public static void main(String[ ] args) {
        // Create int array with 2 elements:
        try {
            int[] MyArray = new int[2];
            for (int i = 0; i < MyArray.length; i++) {
                System.out.println(i);
            }
            System.out.println(MyArray[5]); // Index out of bound error occurs
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }
}