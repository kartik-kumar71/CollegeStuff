class JavaExample{
  static int i = 100;
  static String s = "Beginnersbook";
  String author="Herbert";
  //Static method
  static void display()
  {
     System.out.println("i:"+i);
     System.out.println("s:"+s);
	 //System.out.println("author:"+author);//non-static variable
  }

  //non-static method
  void funcn()
  {
      //Static method called in non-static method
      display();
  }
  
}
 class StaticMethod{
	  //int a=10;
  //static method
  public static void main(String args[])
  {
	  JavaExample obj = new JavaExample();
	  //You need to have object to call this non-static method
	  obj.funcn();
	  System.out.println("author:"+obj.author);//non-static variable
	  JavaExample.i=101; //static variable
	  JavaExample.s="Beginnersbook1"; //static variable
      //Static method called without object
      JavaExample.display();
   }
}