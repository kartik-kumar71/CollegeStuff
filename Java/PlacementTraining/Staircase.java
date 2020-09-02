import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfWays(n+1));
    }


    public static int noOfWays(int n) {
        if (n <= 1)
            return n;
        return noOfWays(n-1) + noOfWays(n-2);
    }
}