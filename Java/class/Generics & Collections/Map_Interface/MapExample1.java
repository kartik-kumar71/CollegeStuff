import java.util.*;  
class MapExample1{  
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(101,"Vijay");  
		map.put(102,"Rahul");  
		System.out.println(map);
		//map.put(102,"Amit");
		//Elements can traverse in any order 
			//Entry is the subinterface of Map. 
			//So we will be accessed it by Map.Entry name. 
			//It returns a collection-view of the map, whose elements are of this class. 
			//It provides methods to get key and value.
			//public Set entrySet(): This method is used to return the Set view 
			//containing all the keys and values.
		for(Map.Entry m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}  
}  