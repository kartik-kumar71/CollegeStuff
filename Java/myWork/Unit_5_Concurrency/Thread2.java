class Conc implements Runnable{
  public void run(){
    try{
      System.out.println("Thread --> "+Thread.currentThread().getId()+"\nname --> " +Thread.currentThread().getName() + "\n");
    }

    catch(Exception e){
      System.out.println("Exception : "+e);
    }

  }
}
public class Thread2{
  public static void main(String[] args) {
    for (int i = 0 ; i<5 ; i++) {
      Thread ob = new Thread(new Conc());
      ob.start();
    }
  }
}
