package ObjectsAndClasses;

class MyObjects {
    public String name;
    public int itemNr = 0;

    // Constructor:
    public MyObjects(String name, int itemNr) {
        this.name = name;
        this.itemNr = itemNr;
    }

    public static void main(String[] args) {
        MyObjects object1 = new MyObjects("Mug", 1);

    }
}
