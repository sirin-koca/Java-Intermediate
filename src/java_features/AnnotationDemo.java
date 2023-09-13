package java_features;

public class AnnotationDemo {

    @Deprecated
    public void oldMethod() {
        System.out.println("This is the old method.");
    }

    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();
        demo.oldMethod();
    }
}
