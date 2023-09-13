package java_features;

/*
* Java Beans is a convention in Java for creating reusable software components based on specific naming and design patterns.
Key points about Java Beans:
Default Constructor: Must have a no-argument constructor.
Private Fields: Properties/fields should be private for encapsulation.
Getter and Setter Methods: For every property, there should be getter and setter methods following a naming pattern.

* Optional but common:
Serializable: Can optionally implement the Serializable interface, allowing them to be saved and restored.

Simple Example:
public class JavaBeansDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        JavaBeansDemo person = new JavaBeansDemo();
        person.setName("Sirin");
        System.out.println(person.name);
    }
}
*/

public class JavaBeansDemo implements java.io.Serializable {

    // Private fields
    private String name;
    private int age;

    // Default constructor
    public JavaBeansDemo() {}

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        JavaBeansDemo person = new JavaBeansDemo();
        person.name = "Alice";
        person.age= 30;
        System.out.println("Name and age for this person:\nName: " + person.name + " and age: " + person.age);
    }
}
