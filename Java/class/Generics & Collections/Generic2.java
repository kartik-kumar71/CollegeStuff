// A Simple Java program to show multiple 
// type parameters in Java Generics 

// We use < > to specify Parameter type 
class Test<T, U, R> 
{ 
	T obj1; // An object of type T 
	U obj2; // An object of type U 
  	R obj3;

	// constructor 
	Test(T obj1, U obj2, R obj3) 
	{ 
		this.obj1 = obj1; 
		this.obj2 = obj2; 
      	this.obj3=obj3;
	} 

	// To print objects of T and U 
	public void print() 
	{ 
		System.out.println(obj1); 
		System.out.println(obj2); 
      	System.out.println(obj3); 
	} 
} 

// Driver class to test above 
class Generic2 
{ 
	public static void main (String[] args) 
	{ 
		Test <String, Integer, Float> obj = new Test<>("GfG", 15, 3.14f); 

		obj.print(); 
	} 
}
