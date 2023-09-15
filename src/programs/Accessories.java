package programs;

import java.util.ArrayList;
import java.util.List;

public class Accessories {

    // An inner class to represent an accessory
    private static class Accessory {
        private String name;
        private double price;

        public Accessory(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Accessory name = " + name + ", price = " + price;
        }
    }

    // A collection of accessories
    private List<Accessory> accessories;

    public Accessories() {
        this.accessories = new ArrayList<>();
    }

    // Adds an accessory to the collection
    public void addAccessory(String name, double price) {
        Accessory accessory = new Accessory(name, price);
        accessories.add(accessory);
    }

    // Display all accessories
    public void displayAccessories() {
        for (Accessory access : accessories) {
            System.out.println(access);
        }
    }

    public static void main(String[] args) {
        Accessories Store = new Accessories();

        Store.addAccessory("Watch", 200.0);
        Store.addAccessory("Necklace", 300.5);
        Store.addAccessory("Ring", 120.75);

        System.out.println("Available accessories: ");
        Store.displayAccessories();

    }
}
