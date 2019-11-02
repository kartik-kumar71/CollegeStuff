import java.io.*; 
import java.util.*;
public class chal2 {
	public static void main(String args []) {
		//String av = "";
		//String is = "";
		ArrayList<Integer> av = new ArrayList<Integer>();
		ArrayList<Integer> is = new ArrayList<Integer>();
		ArrayList<Integer> miss = new ArrayList<Integer>();
		try {
			FileReader avail = new FileReader("available.txt");
			FileReader iss = new FileReader("issued.txt");
			FileWriter missed = new FileWriter("missed.txt");
			int ch1;
			int book_miss;
			int book_av;
			int book_is;
    		while((ch1=avail.read())!=-1) {
    			if ((char)ch1 != '\n')
       				av.add(Character.getNumericValue(ch1));
        	}
        	int ch2;
        	while((ch2=iss.read())!=-1) {
        		if ((char)ch2 != '\n')
       				is.add(Character.getNumericValue(ch2));
        	}
      
        	//System.out.println(av);
        	//System.out.println(is);

        	for (int i = 1 ; i <= 10 ; i++) {
         		if ( av.contains(i) | is.contains(i) ) {
        			continue;
        		}
        		else {
        			miss.add(i);
        		}
        	}
        	for (Integer i : miss) {
        		missed.write(i.toString() + "\n");
        	}
        	book_miss = miss.size();
        	book_is = is.size();
        	book_av = av.size();
        	avail.close();
        	iss.close();
        	missed.close();
        	System.out.println("Stock Verification Report");
        	System.out.println("Total Books : "+ 10);
        	System.out.println("Available Books : " + book_av);
        	System.out.println("Issued Books : " + book_is);
        	System.out.println("The Missed Book accessing number : "+ miss);

        }
        catch (IOException e) {
        	System.out.println("error");
        }
        //avail.close();
        //iss.close();

    }

}