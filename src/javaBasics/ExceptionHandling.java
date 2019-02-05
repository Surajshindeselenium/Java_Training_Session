package javaBasics;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		try{
			int i=10/0;//Uncaught exception
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("ABC");
	
	}

}
