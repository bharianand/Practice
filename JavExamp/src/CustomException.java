class InvalidAgeException extends Exception{
	public InvalidAgeException(String s){
		super(s);
	}
}

public class CustomException{
		static void ageCheck(int age) throws InvalidAgeException{
		if(age < 18)
			System.out.println("You are not eligible for vote");
		else
			System.out.println("You are eligible");
	}
	
	
	public static void main(String ar[]){
		try{
			ageCheck(17);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("normal flow");
	}
}
