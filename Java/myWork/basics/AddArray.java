import java.util.Arrays;
public class AddArray {
    public static int[] add(int [] a, int [] b) {
      int [] result = new int[a.length];
      for (int i = 0; i < a.length ; i++) {
        result[i] = a[i] + b[i];
      }
      return result;

    }

    public static void main(String args[]) {

        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };
        int[] result = add(even, odd);
        System.out.println("first array: " + Arrays.toString(even));
        System.out.println("second array: " + Arrays.toString(odd));
        System.out.println("sum of array: " + Arrays.toString(result));
        
        int[] prime = { 2, 3, 5};
        result = add(even, prime);
        System.out.println("first array: " + Arrays.toString(even));
        System.out.println("second array: " + Arrays.toString(prime));
        System.out.println("sum of array: " + Arrays.toString(result));
    }



}
