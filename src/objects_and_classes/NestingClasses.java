class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {
        public void think() {
            System.out.println("Robot nr " + id + " is thinking...");
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }
}
