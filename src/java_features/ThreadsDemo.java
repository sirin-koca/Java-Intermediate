package java_features;

class Loader extends Thread {
    public void run() {
        System.out.println("Program says: I am running.");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
}