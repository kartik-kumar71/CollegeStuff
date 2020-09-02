import java.util.Scanner;

public class SeriesGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 3;
        int b = 8;

        if (n == 0) {
            System.out.println();
        }
        else if (n == 1) {
            System.out.println(a);
        }
        else if (n == 2) {
            System.out.println(a + " " + b);
        }
        else {
            System.out.print(a + " " + b + " ");
            for (int i = 1 ; i <= n-2 ; i++) {
                System.out.print(a + b + i + 1 + " ");
                int t = a;
                a = b;
                b = t + i + b +1;
            }
            System.out.println();
        }
    }
}