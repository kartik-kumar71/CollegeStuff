import java.util.Scanner;


public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n*(n-1)/2;
        System.out.println(h);
    }
}