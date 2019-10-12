// Java program to illustrate error in case 
// of unhandled exception 
class Exception8_1 
{ 
	// there is a chance of exception if the main thread is going to sleep, 
	//other threads get the chance to execute main() method which will cause 
	//InterruptedException.
	public static void main(String[] args)throws InterruptedException
	{ 
		Thread.sleep(1000); 
		System.out.println("Hello Geeks"); 
	} 
} 
/*We can use throws keyword to delegate the responsibility of exception handling 
to the caller (It may be a method or JVM) then caller method is responsible 
to handle that exception.*/