class Item {

        public int itemID;
        public String desc;
        public double price;
        public int quantity;
		
		void insertRecord(int id, String des, double pri, int qty)
		{
			itemID=id;
			desc=des;
			price=pri;
			quantity=qty;
		}
		void display()
		{
			
			System.out.println("The Item Id is "+ this.itemID+ 
               "\nThe Item Description is "+ this.desc+
			   "\nThe Item Price is "+ this.price+
			   "\nThe Item Quantity is "+ this.quantity);
		}
        
}
