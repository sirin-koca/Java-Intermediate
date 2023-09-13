package oop_principles;

// Inheritance allows a class to inherit attributes and methods from another class.
class AnimalInheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends AnimalInheritance {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
