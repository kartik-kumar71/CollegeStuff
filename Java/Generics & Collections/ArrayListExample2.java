import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String... args)
    {
        ArrayList<Object> al = new ArrayList<>();
        al.add("Java4s");
        al.add(12);
        al.add(12.54f);
		//System.out.println(a1); 
        for(int i=0;i<al.size();i++)
        {
            System.out.println("Value is "+al.get(i));    
			
        }

    }
}