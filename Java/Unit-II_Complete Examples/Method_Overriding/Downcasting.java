class Super {
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Downcasting extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }

   public static void main(String args[]) {
      Super obj = new Downcasting();
      Downcasting sub = (Downcasting) obj; 
	  sub.Sample();
   }
}