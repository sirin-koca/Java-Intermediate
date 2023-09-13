package java_features;
/* In Java, ENUM is a special type of data and class that represents a group of constants (unchangeable variables,
like final variables).

    Example code:
    In this example, Days is an enum that specifies the days of the week. You can then use it in your code like this:

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    Days today = Days.MONDAY; // This ensures that the value of today is always one of the valid days, making your code safer and more understandable.

## Key Points:
Use it when you have a fixed set of related constants.
Provides type safety.
Can have methods, constructors, and variables.
Enum constants are implicitly static and final.


*/

// Basically, Enums define variables that represent members of a fixed set.

public class EnumDemo {

    enum CoffeeSize {  // enum class
        SMALL(100),
        MEDIUM(200),
        LARGE(300);

        private int ml;  // Encapsulation: private field

        CoffeeSize(int ml) {  // Constructor
            this.ml = ml;
        }

        public int getMl() {  // Public method to expose private field
            return ml;
        }
    }

    public static void main(String[] args) {

        CoffeeSize myCoffee = CoffeeSize.MEDIUM;  // Abstraction: using the enum type

        switch (myCoffee) {  // Control structure: using enum in switch-case
            case SMALL:
                System.out.println("Ordered small coffee!");
                break;
            case MEDIUM:
                System.out.println("Ordered medium coffee!");
                break;
            case LARGE:
                System.out.println("Ordered large coffee!");
                break;
        }

        // Inheritance: using a method from the Enum class
        System.out.println("Coffee size name: " + myCoffee.name());

        // Using our method to get encapsulated data
        System.out.println("Coffee in ml: " + myCoffee.getMl());
    }
}

