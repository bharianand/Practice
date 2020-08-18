import java.io.IOException;

public class TestThrow {
	
	void methodM() throws IOException{
		throw new java.io.IOException("device error");
	}
	
	void methodN() throws IOException{
		methodM();
	}
	
	void methodP(){
		try{
			methodN();
		}catch(Exception e){
			System.out.println("Exception Handled."+e);
		}
	}
	
	public static void main(String ar[]){
		TestThrow tt = new TestThrow();
		tt.methodP();
		System.out.println("Data Flow");
	}
}
