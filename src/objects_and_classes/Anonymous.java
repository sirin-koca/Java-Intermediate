//Anonymous classes are a way to extend the existing classes on the fly.


class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

// When creating the Machine object, we can change the start method on the fly.

public static void main(String[ ] args) {
  Machine m = new Machine() {
    @Override public void start() {
      System.out.println("Wooooo");
    }
  };
  m.start();
}
