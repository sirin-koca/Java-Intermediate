package java_features;

public class JavaBeansDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        JavaBeansDemo person = new JavaBeansDemo();
        person.setName("Sirin");
        System.out.println(person.name);
    }
}
