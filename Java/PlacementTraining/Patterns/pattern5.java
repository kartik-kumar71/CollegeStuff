import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print("  ");
            }

            for (int k = 1 ; k <= 2*i -1 ; k++) {
                if (k == 1 || k ==2*i -1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        for (int i = 1 ; i <= n-1 ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("  ");
            }

            for (int k = 1 ; k <= 2*(n-i)-1 ; k++) {
                if (k == 1 || k ==2*(n-i)-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}