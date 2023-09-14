package java_features;

class RunLoader implements Runnable {
    public void run() {
        System.out.println("Hello from Runnable!");
    }
}

class RunClass {
    public static void main(String[ ] args) {
        Thread t = new Thread(new RunLoader());
        t.start();
    }
}