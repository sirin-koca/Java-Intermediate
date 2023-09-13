package oop_principles;

class Main {
   public static void main(String[] args) {
       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}

abstract class Game {
   abstract String getName();
   abstract void play();
}

class Monopoly extends Game {

   //give "oop_principles.Monopoly" name to game
   String getName() {
       return "oop_principles.Monopoly";
   }

   // play method should print "Buy all property."
   void play() {
       System.out.println("Buy all property.");
   }
}

class Chess extends Game {

   //give "oop_principles.Chess" name to game
   String getName() {
       return "oop_principles.Chess";
   }

   // play method should print "Kill the enemy king."
   void play() {
       System.out.println("Kill the enemy king.");
   }
}

class Battleships extends Game {

   //give "oop_principles.Battleships" name to game
   String getName() {
       return "Battlerships";
   }

   // play method should print "Sink all ships."
   void play() {
       System.out.println("Sink all ships.");
   }
}
