package java_features;

/*
The Thread.sleep() method pauses a Thread for a specified period of time. For example, calling Thread.sleep(1000);
pauses the thread for one second. Keep in mind that Thread.sleep() throws an InterruptedException,
so be sure to surround it with a try/catch block.
 */

class ThreadSetPriority {
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
        System.out.println("Please enter your name:");
    }
}
