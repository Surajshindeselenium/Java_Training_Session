package javaBasics;

public class FincallyConcept {
	
	//finally is block
	//Which is used with try...catch.
	//finally block code always gets executed even if exception not occured 

	public static void main(String[] args) {
		//test1();
		FincallyConcept obj = new FincallyConcept();
		//obj.test2();
		obj.div();
		
	}
	public static void test1(){
		try{
			System.out.println("This is test1 method");
			throw new RuntimeException("Test");
		}catch(Exception e) {
		System.out.println("This is catch block");
		}
		finally{
			System.out.println("This is finally block");
		}
		
		}
	public void test2(){
		try{
			System.out.println("This test2 method");
		}
		finally{
			System.out.println("Inside finally");
		}
		
	}
	public void div(){
		int i=10;
		try{
			System.out.println("Inside try block");
			int k=i/0;
		}catch(ArithmeticException e){
			System.out.println("inside catch bock");
			System.out.println("divide by 0 error");
		}
		finally{
			System.out.println("this is div finally block");
		}
	}
}
