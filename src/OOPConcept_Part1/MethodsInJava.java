package OOPConcept_Part1;

public class MethodsInJava {
	//main method is void, never return a value
	public static void main(String[] args) {
		//after creating object copy of all non static methods will be given to this object(object can't hold static methods)
		MethodsInJava obj=new MethodsInJava();
		obj.test();
		int a=obj.PQR();
		System.out.println(a);
		String b=obj.QA();
		System.out.println(b);
		int E=obj.division(30,10);
		System.out.println(E);
		
	}
	//non static methods
	public void test(){//no input, no output
		System.out.println("Test method");
		
	}
	//here, we are returning c and c is int hence return type of method is int
	public int PQR(){//no input, some output 
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c = a+b;
		return c;
		
	}
	public String QA(){//no input, some output 
		System.out.println("QA method");
		String s="Selenium";
		return s;
		
	}
	//x and y are input parameter/arguments 
	public int division(int x, int y){
		System.out.println("Division method");
		int d = x/y;
		return d;
	}
}
