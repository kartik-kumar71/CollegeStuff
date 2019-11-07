class Customer {
	String name;
	int custID;
	void setData(String name, int custID)
	{
		this.name=name;
		this.custID=custID;
	}
	void showData()
	{
		System.out.println("The Customer name is="+name);
		System.out.println("The Customer id is="+custID);
	}
}
class CustomerMain{
	public static void main(String[] args){

		Customer customer01 = new Customer();	//Declare and instantiate
		customer01.setData("Ram",1000);
		customer01.showData();
	}
}