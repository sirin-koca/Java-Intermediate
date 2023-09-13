class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
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

// Implement the Swimmer and the Player interfaces
abstract class Animal implements Swimmer, Player { }

class Dog extends Animal {
    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }
}

class Cat extends Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming.");
    }
}
