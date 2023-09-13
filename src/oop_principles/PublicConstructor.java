package oop_principles;

public class PublicConstructor {
    private String name; // Private attribute

    // Public constructor
    public PublicConstructor(String name) {
        this.name = name;
    }

    // Public method to access the private attribute
    public String getName() {
        return name;
    }

    // Public method to modify the private attribute
    public void setName(String name) {
        this.name = name;
    }
}
