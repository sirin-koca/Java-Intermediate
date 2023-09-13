package programs;/*The class Robot has an inner class Brain. The inner class can access all of the member variables and methods of its outer class,
but it cannot be accessed from any outside class.*/

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

public class RobotProgram {
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }
}
