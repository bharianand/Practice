import java.util.*;
public class HasExmp {
	public static void main(String ar[]){
		Map<String,Integer> map = new HashMap<>();
		map.put("abc", 12);
		map.put("aba", 15);
		map.put("abb", 18);
		map.put("cba", 20);
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		for(Map.Entry<String, Integer> en : set){
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}
}

