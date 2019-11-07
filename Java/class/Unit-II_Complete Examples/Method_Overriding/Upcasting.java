class Super {
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Upcasting extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }
   
   public static void main(String args[]) {
      Super obj =(Super) new Upcasting(); 
	  obj.Sample();
   }
}