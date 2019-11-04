import java.util.Scanner;

public class ScannerTest {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer ---> ");
    int x = sc.nextInt();
    System.out.println("You entered ---> " + x);
  }
}
