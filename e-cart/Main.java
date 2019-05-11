//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public Item(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
   
class Customer
{
  private String product;
  private int quantity;
  public Customer(String product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

class Bill
{
  public void calculateTotal(Item item,Customer customer) {
		
		int totalAmout = item.getPrice() * customer.getQuantity();
		System.out.println("Total Price is : " + totalAmout);
			
	}
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner (System.in);
		String productName = s.nextLine();
		int price = s.nextInt();
		int quantity = s.nextInt();
    Item i = new Item(price);
    Customer c = new Customer(productName,quantity);
    Bill obj = new Bill();
   obj.calculateTotal(i, c);
  }
}