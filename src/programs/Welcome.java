package programs;

import javax.swing.*;

class WelcomeMain {
    public static void main(String[ ] args) throws InterruptedException {

        Name name = new Name();
        Welcome welcome = new Welcome();

        welcome.setPriority(1);
        name.setPriority(2);

        welcome.start();
        name.start();
    }
}

class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}

class Name extends Thread{
    public void run() {
        String name = JOptionPane.showInputDialog("Enter your name here:");
        System.out.println("Hello, " + name);
    }
}