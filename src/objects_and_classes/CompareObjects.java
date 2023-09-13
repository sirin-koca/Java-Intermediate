package objects_and_classes;

class MyAnimals {
    String name;
    MyAnimals(String n) {
        name = n;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        MyAnimals a1 = new MyAnimals("Robby");
        MyAnimals a2 = new MyAnimals("Robby");
        System.out.println("Is a1 = a2? " + "Answer: " + (a1 == a2));
    }
}


/*
public static void main(String[ ] args) {
  Animal a1 = new Animal("Robby");
  Animal a2 = new Animal("Robby");
  System.out.println(a1.equals(a2));
}

OBS! 
The automatically generated hashCode() method is used to determine where to store the object internally. 
Whenever you implement equals, you MUST also implement hashCode: 

Just right click in your class, go to Source->Generate hashCode() and equals()...  

*/
