
public class CapitalizeFirstWordMain {
	public static void main(String ar[]){
		System.out.println(mcallFunction("this is hari"));
		System.out.println(mcallFunction("basically from ooty"));
	}
	
	public static String mcallFunction(String inputString){
		String strArr[] = inputString.split("\\s");
		String conCatString = "";
		
		for(String s : strArr){
			// String first = s.substring(0, 1);
			// String second = s.substring(1);
			// conCatString += first.toUpperCase()+second+" ";
			conCatString += s.substring(0, 1) .toUpperCase()+s.substring(1).toLowerCase()+" ";
		}
		
		return conCatString.trim();
	}
}
