import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class ListWithComp {
	public static void main(String ar[]){

		List<Integer> lstVal = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0;i<100;i++){
			lstVal.add(r.nextInt(1000));
		}
		
		lstVal.forEach(System.out::println);
		
		Collections.sort(lstVal, (i,j) -> i%10 < j%10 ? -1 : i%10 > j%10 ? 1 : 0);
		System.out.println("After Sorting ...");
		lstVal.forEach(System.out::println);
		
	}
}
