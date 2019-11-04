import java.util.Arrays;

public class JaggedArr {
	public static void main(String[] args) {

    int[][] myarr = new int[4][];

		myarr[0] = new int[] {8,4,6};
		myarr[1] = new int[] {0,3,5,1};
		myarr[2] = new int[] {0,3,1,5};
    myarr[3] = new int[] {4};

		for (int[] i : myarr)
			System.out.println(Arrays.toString(i));
	}
}
