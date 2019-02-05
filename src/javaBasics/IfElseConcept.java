package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		if(a>b)
		{
			System.out.println("a is grater than b");
		}
		else 
		{
			System.out.println("b is greater than a");
		}
			
		int a1=100;
		int b1=200;
		int c1=300;
		if (a1>b1 & a1>c1){
			System.out.println("a1 is higest");
		}
		else if(b1>c1 & b1>a1){
			System.out.println("b1 is highest");
			
		}
		else{
			System.out.println("c1 is higest");
		}

	}

}
