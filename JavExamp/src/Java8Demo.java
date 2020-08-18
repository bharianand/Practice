import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Java8Demo {
	public static void main(String[] ar){
		List<Integer> lstValues = Arrays.asList(12,20,35,46,55,68,75);
		// List<Integer> lstValues = Arrays.asList(12,33,72);
		
		// lstValues.forEach( i -> System.out.println(i));
		
		// lstValues.forEach(System.out::println);
		// lstValues.forEach(Java8Demo::doubleit);
		
//		int values = 0;
//		for(int i : lstValues){
//			values = values + i;
//		}	
//		System.out.println(values);
		
		// System.out.println(lstValues.stream().map(i -> i*2).reduce(0,(c, e) -> c + e));
				
		// System.out.println(lstValues.stream().map(t -> t+20).reduce(0,Integer::sum));
		
		// System.out.println(lstValues.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		System.out.println(lstValues.stream()
				/*.filter(i -> i%5==0)
				.map(i -> i*2) */
				.filter(Java8Demo :: isDivisable)
				// .map(Java8Demo :: mapDouble)
				.findFirst()
				.orElse(0));
	} 
	
//	public static void doubleit(Integer i){
//		System.out.println(i*2);
//	}
	
	
	public static boolean isDivisable(int i){
		System.out.println("Is Divisiable ..."+i);
		return i%5==0;
	}
	
	public static int mapDouble(int i){
		System.out.println("Is mapDouble ..."+i);
		return i*2;
	}
}
