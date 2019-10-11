public class item {
	int id;
	String descr;
	int quantity;
	double price;

	public item(int id, String descr, int quantity, double price) {
		this.id = id;
		this.descr = descr;
		this.quantity = quantity;
		this.price = price;
	}

/*
	public void display() {
		System.out.println("\n\n=========================");
		System.out.println("ID = " + id);
		System.out.println("Description = " + descr);
		System.out.println("Quantity = " + quantity);
		System.out.println("Price = " + price);
		System.out.println("=========================\n\n");
	}
*/
	public void display() {
		System.out.println(id + "\t\t" + descr + "\t\t\t" + quantity + "\t\t\t\t" + price);
	}

}