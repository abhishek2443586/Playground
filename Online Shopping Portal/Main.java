public class Main {
	public static void main(String[] args) {
		Customers customerObj1 = new Customers();
		customerObj1.setId(1001);
		customerObj1.setName("Saakshi");
		customerObj1.setMobileNumber(9000000000L);
		customerObj1.setShippingAddress("Bangalore");
		customerObj1.setDateOfBirth("16-jul-1990");
		customerObj1.setGender('F');
		customerObj1.setOrderHistory("Lakme Kajal salwar");

		Customers customerObj2 = new Customers();
		customerObj2.setId(1008);
		customerObj2.setName("Rahul");
		customerObj2.setMobileNumber(9000000001L);
		customerObj2.setShippingAddress("Chennai");
		customerObj2.setDateOfBirth("27-jan-1992");
		customerObj2.setGender('M');
		customerObj2.setOrderHistory("T-shirt Jeans");

		Supplier supplierObj1 = new Supplier();
		supplierObj1.setId(7901);
		supplierObj1.setName("ABC Traders");
		supplierObj1.setMobileNumber(8000000000L);
		supplierObj1.setBillingAddress("Mumbai");
		supplierObj1.setItemStock(10);
		supplierObj1.setPaymentStatus("Paid");
		supplierObj1.setFeedBackRating(4.75f);

		Supplier supplierObj2 = new Supplier();
		supplierObj2.setId(7972);
		supplierObj2.setName("XYZ Enterprises");
		supplierObj2.setMobileNumber(8000000900L);
		supplierObj2.setBillingAddress("Kolkata");
		supplierObj2.setItemStock(7);
		supplierObj2.setPaymentStatus("Unpaid");
		supplierObj2.setFeedBackRating(4.35f);

		customerObj1.displayProfileDetails(customerObj1);
		customerObj2.displayProfileDetails(customerObj2);
		supplierObj1.displayProfileDetails(supplierObj1);
		supplierObj2.displayProfileDetails(supplierObj2);
		
      customerObj1.editAddress("Coimbatore");
		supplierObj1.editAddress("Delhi");
      
		customerObj1.placeOrder();
		supplierObj1.increaseStockLeve(5);
		supplierObj2.increaseStockLeve(10);
    }	
}

class Users {
	int id;
	String name;
	long mobileNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}		      
}

class Customers extends Users{
		String shippingAddress;
	String dateOfBirth;
	char gender;
	String orderHistory;

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(String orderHistory) {
		this.orderHistory = orderHistory;
	}

	// Methods
	public void editAddress(String address) {
		System.out.println(name + ", " + shippingAddress);
		shippingAddress = address;
		System.out.println(name + ", " + shippingAddress);
	}

	public void placeOrder() {
		System.out.println("Order placed successfully!");
	}

	public void displayProfileDetails(Customers object) {
		System.out.println(object.getName() + ", " + object.getMobileNumber());
	}
}

class Supplier extends Users {
		String billingAddress;
	int itemStock;
	String paymentStatus;
	float feedBackRating;

	// supplier methods

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public float getFeedBackRating() {
		return feedBackRating;
	}

	public void setFeedBackRating(float feedBackRating) {
		this.feedBackRating = feedBackRating;
	}

	public void editAddress(String address) {
		System.out.println(name + ", " + billingAddress);
			billingAddress = address;
			System.out.println(name + ", " + billingAddress);
	}

	public void increaseStockLeve(int stock) {
		itemStock = itemStock + stock;
		System.out.println(name+", " +itemStock);
	}

	public void displayProfileDetails(Supplier object) {
		System.out.println(object.getName() + ", " + object.getMobileNumber());
	}
}