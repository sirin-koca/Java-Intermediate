package arrays;
/*
Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
 */
public class Array {
    private int[] items;
    private int counter;

    public Array(int length) {
        items = new int[length];
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public void insert(int item) {
        // If the arrays is full resize it
        if (items.length == counter) {

            // Create a new array (twice the size)
            int[] newNumbers = new int[counter * 2];

            // Copy all the existing elements
            for (int i = 0; i < counter; i++) {
                newNumbers[i] = items[i];
            }
            // Set "items" to this new array
            items = newNumbers;
        }

        // Add the new item at the end
        items[counter++] = item;
    }

    public void remove(int index) {
        // Validate the index
        if (index < 0 || index >= counter)
            throw new IllegalArgumentException("Something went wrong, please try again!");

        // Shift the items to the left to fill the hole
        for (int i = index; i < counter; i++) {
            items[i] = items[i + 1];
        }
        counter--;
    }

    public int indexOf(int item) {
        // If we find it, return index otherwise, return -1
        // Big O Notation: Runtime complexity for the worst case scenario for this algorith is O(n) in linear time
        for (int i = 0; i < counter; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        int n = items.length;
        for (int i = 0; i < n; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {

        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        // When we add a new item out of bound, it will copy and resize the existing array
        numbers.insert(40);
        numbers.print();

        System.out.println("Now remove index3: ");
        numbers.remove(3);
        numbers.print();

        System.out.print("indexOf 30 is : " + numbers.indexOf(30));
    }
}
