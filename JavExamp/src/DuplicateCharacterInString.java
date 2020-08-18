import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateCharacterInString {

	public static void duplicateKeyCount(String inputString){
		Map<Character,Integer> charCountMap = new HashMap<>();
		
		char[] charArray = inputString.toCharArray();
		for(Character ch : charArray){
			
			if(charCountMap.containsKey(ch)){
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}
			else{
				charCountMap.put(ch, 1);
			}
			
			
		}
		
		Set<Character> charInString = charCountMap.keySet();
		for(Character charSet : charInString){
			if(charCountMap.get(charSet) > 1){
				System.out.println(charSet + " " + charCountMap.get(charSet));
			}
		}
		
		System.out.println(charCountMap);
	}
	
	public static void main(String ar[]){
		duplicateKeyCount("javaj2ee");
	}
	
}
