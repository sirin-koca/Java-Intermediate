/* Polymorphism allows objects of different classes to be treated as objects of a common superclass. 
The most common use of polymorphism is when a parent class reference is used to refer to a child class object.
*/

class Bird {
    void sound() {
        System.out.println("The bird makes a sound");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("The sparrow chirps");
    }
}

class Crow extends Bird {
    void sound() {
        System.out.println("The crow caws");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Bird myBird;

        myBird = new Sparrow();
        myBird.sound();

        myBird = new Crow();
        myBird.sound();
    }
}
