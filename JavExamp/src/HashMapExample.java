import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
	public static void main(String ar[]){
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		/* map.put("myname","hari");
		map.put("actor", "rajini");
		map.put("cricketer", "sachin"); */
		
		map.put("myname",300);
		map.put("actor", 50);
		map.put("cricketer", 150);
		
		// Set<String> sets = map.keySet();
		
		for(String key : map.keySet()){
			System.out.println(key + " "+map.get(key));
		}
	}
}
