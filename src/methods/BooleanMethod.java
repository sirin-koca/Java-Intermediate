package methods;

public class BooleanMethod {
    private int x;
    public boolean equals(Object o){
        return ((BooleanMethod)o).x == this.x;
    }

    public static void main(String[] args) {
        BooleanMethod a = new BooleanMethod();
        a.x = 9;

        BooleanMethod b = new BooleanMethod();
        b.x = 5;

        System.out.println("Is a equal b? \nThe answer is: " + a.equals(b));
    }
}

