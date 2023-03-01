package methods;

public class MethodCall {
    public static void main(String[] args) {

        // Static methods are the methods in Java that can be called without creating an object of a class.
        String greetings = GenerateMessage.method1();
        System.out.println(greetings);

        GenerateMessage msg1 = new GenerateMessage();
        System.out.println(msg1.method2());

        GenerateMessage.method3();
    }
}

class GenerateMessage {
    static String method1() {
        return "1) Hello, Im method1, how are you today?";
    }

    public boolean method2(){
        System.out.print("2) Method2 is so wrong: ");
        return true;
    }

    static void method3(){
        System.out.println("3) Im method3, my job is to print these numbers:");
        for (int i = 1; i < 10; i++) {
            System.out.print("Nr. " + i + ", ");
        }
        System.out.println("Nr. " + 10);
    }
}