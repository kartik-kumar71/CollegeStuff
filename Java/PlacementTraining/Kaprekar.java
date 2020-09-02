import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n * n;
        int len = String.valueOf(n).length();
        
        int sum = (int) (x/Math.pow(10, len) + x%Math.pow(10, len));
        if (sum == n)
            System.out.println("Kaprekar Number!");
        else
            System.out.println("It is not a Kaprekar Number!");
    }
}