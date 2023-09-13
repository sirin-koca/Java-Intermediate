package oop_principles;/* This code demonstrates polymorphism and inheritance by creating objects of different classes that implement the same interface and
have different implementations of the same method.*/

class MainAnimals {
   public static void main(String[] args) {
       Animals dog = new Animals() {
           @Override
           public void play() {

           }

           @Override
           public void swim() {

           }
       };
       Animals cat = new Animals() {
           @Override
           public void play() {

           }

           @Override
           public void swim() {

           }
       };
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();
   }
}

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

// Implement the oop_principles.Swimmer and the oop_principles.Player interfaces
abstract class Animals implements Swimmer, Player { }

class Doggy extends Animals {
    @Override
    public void play() {
        System.out.println("oop_principles.Dog is playing.");
    }

    @Override
    public void swim() {
        System.out.println("oop_principles.Dog is swimming.");
    }
}

class Cat extends Animals {
    @Override
    public void play() {
        System.out.println("oop_principles.Cat is playing.");
    }

    @Override
    public void swim() {
        System.out.println("oop_principles.Cat is swimming.");
    }
}
