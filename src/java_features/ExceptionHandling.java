package java_features;
/*
An exception is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.
Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

There are two exception types, checked and unchecked (also called runtime). The main difference is that
checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.

Checked exceptions must be either caught or declared, otherwise, your program won't compile. It's not about
"preventing a crash" at runtime (as the program wouldn't run if it doesn't compile), but rather ensuring that
developers are aware of and handle potential exceptional conditions. Unchecked exceptions, on the other hand,
can lead to crashes if not handled.
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