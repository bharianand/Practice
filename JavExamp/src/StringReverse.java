
public class StringReverse {
	public static void main(String ar[]){
		System.out.println(strReverse("i am hari"));
		System.out.println(strReverse("form ooty"));
	}
	
	public static String strReverse(String inputString){
		/*StringBuilder sb = new StringBuilder(inputString);
		sb.reverse();
		return sb.toString();
		*/
		
		System.out.println(inputString.toUpperCase());
		String[] strArr = inputString.split("\\s");
		String passString = "";
		for(String sa : strArr){
			passString += sa.substring(0, 1).toUpperCase()+sa.substring(1).toLowerCase()+" ";
		}
		
		String retString = "";
		char[] ch = passString.toCharArray();
		for(int i=ch.length-1; i>=0;i--){
			retString += ch[i];
		}
			
		
		return retString;
		
		/*char[] ch = inputString.toCharArray();
		String str = "";
		for(int c=ch.length-1;c>=0;c--){
			str+=ch[c];
		}
		return str;*/
		
	}
}
