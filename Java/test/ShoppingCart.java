import java.util.Scanner;
public class ShoppingCart {
	public void reciept(item [] ob,int n,String name,String number) {
		double total = 0;
		System.out.println("========== Customer details ==========");
		System.out.println("-> Name = " + name);
		System.out.println("-> Contact number = " + number);
		System.out.println("======================================\n");
		System.out.println("---------");
		System.out.println("|Receipt|");
		System.out.println("---------");
		System.out.println("id\t\tdescription\t\tquantity\t\t\tprice");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0 ; i < n ; i++) {
			ob[i].display();
			total += ob[i].price;
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tTotal = " + total + "\n");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,quantity;
		String descr,num;
		double price;
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Enter your contact number : ");
		num = sc.next();
		System.out.print("Enter the number of items you plan to purchase : ");
		int n = sc.nextInt();
		item obj[] = new item[n];
		for (int i = 0 ; i < n ; i++) {
			System.out.print("Enter the id of the item: ");
			id = sc.nextInt();
			System.out.print("Enter the description : ");
			descr = sc.next();
			System.out.print("Enter the quantity : ");
			quantity = sc.nextInt();
			System.out.print("Enter the price : ");
			price = sc.nextDouble();
			System.out.print("\n\n");
			obj[i] = new item(id,descr,quantity,price);

		}
		reciept(obj,n,name,num);

		System.out.println("Thank you " + name + "\n");
	}
}
