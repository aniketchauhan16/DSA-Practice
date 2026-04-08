package OOPS.Infosys_Springboard;
class Customer {
    public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

    public void displayCustomer(){
        System.out.println("Displaying Customer Details \n        ********");
        System.out.println("Displaying Customer Id : " + customerId );
        System.out.println("Displaying Customer Name : " + customerName );
        System.out.println("Displaying Customer number : "  + contactNumber);
        System.out.println("Displaying Customer adress : " + address);
    }
    public double payBill(double totalPrice, double discountPercentage) {
	System.out.println("Calculating final amount to be paid......");
	double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	System.out.println("Hi " + customerName
			+ ", your final bill amount after discount is: "
			+ (int) (priceAfterDiscount * 100) / 100.0);

            return priceAfterDiscount;
}

}


    class Food {
        public String foodname;
        public String cuisine;
        public String foodtype;
        public int quantityAvailable;
        public double unitPrice;

    }

    class Tester {

	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer();

		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		customer.displayCustomer();
		// Move the above statement immediately after the object creation
		// statement and observe the output
        customer.payBill(500, 10);

	}

}
