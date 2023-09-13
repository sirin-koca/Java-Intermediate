package generics;

public class MyGenericBox<T> {
    private T content;

    public MyGenericBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        MyGenericBox<Integer> intBox = new MyGenericBox<>(5);
        MyGenericBox<String> stringBox = new MyGenericBox<>("Hello Generics");

        System.out.println("Integer Box: " + intBox.getContent());
        System.out.println("String Box: " + stringBox.getContent());
    }
}


