/* Abstraction means using simple things to represent complexity. In Java, abstraction is achieved using abstract classes and interfaces.*/

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }
}
