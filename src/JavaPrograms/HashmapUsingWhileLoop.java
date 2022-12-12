package JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapUsingWhileLoop {

	public static void main(String[] args) {
	HashMap<Integer,String>map=new HashMap<>();
	map.put(2,"phani");
	map.put(25, "kumar");
	  System.out.println("Size of map is:- "
              + map.size());
	  System.out.println(map);
	  
	  if (map.containsKey("vishal")) {  
		  
          // Mapping
          String a = map.get("phani");
          
          // Printing value for the corresponding key
          System.out.println("value for key"
                             + " \"phani\" is:- " + a);
      }
	}
}
