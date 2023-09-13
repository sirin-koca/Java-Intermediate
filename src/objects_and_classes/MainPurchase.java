package objects_and_classes;

public class MainPurchase {
	public static void main(String[] args) {
        
       Purchase customer = new Purchase();

       Purchase specialCustomer = new Purchase(){
           //your code goes here
           @Override public int totalAmount(int price) {
            return price - (price*20)/100;
            }        
        };
        
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
	}
}


class Purchase {
    int price;
    
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}
