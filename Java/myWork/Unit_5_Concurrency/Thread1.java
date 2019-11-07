class Conc extends Thread{
  public void run(){
    try{
      System.out.println("Thread --> "+Thread.currentThread().getId()+"\nname --> " +Thread.currentThread().getName() + "\n");
    }

    catch(Exception e){
      System.out.println("Exception : "+e);
    }

  }
}
public class Thread1{
  public static void main(String[] args) {
    for (int i = 0 ; i<5 ; i++) {
      Conc ob = new Conc();
      ob.start();
    }
  }
}
