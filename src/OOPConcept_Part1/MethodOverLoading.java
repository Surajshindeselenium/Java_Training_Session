package OOPConcept_Part1;

public class MethodOverLoading {

	public static void main(String args [] ) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(5, 60);
		obj.sum("Suraj");

	}
	public void sum(){//zero input parameters 
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is"+c);
	}
	public void sum(int i){//one input parameters 
		
		System.out.println(i);
		
	}
	public void sum(int k,int j){// two input parameters 
		int p=k+j;
		System.out.println(p);
	}
	public void sum(String i){//one parameter with "String" data type
		System.out.println(i);
		
	}

}
