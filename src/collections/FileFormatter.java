package collections;

import java.util.Formatter;
/*
The format() method formats its parameters according to its first parameter.
%s mean a string and get's replaced by the first parameter after the format.
The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces.
Note: \r\n is the newline symbol in Windows.
 */

public class FileFormatter {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\sirin\\ThisFileCreatedByJavaFormatter.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}