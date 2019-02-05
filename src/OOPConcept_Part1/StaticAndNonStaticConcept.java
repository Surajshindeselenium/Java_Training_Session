package OOPConcept_Part1;

public class StaticAndNonStaticConcept {
	
	String name = "Suraj";//non static global variable 
	static int  age= 25;//static global variable 

	public static void main(String[] args) {
		//how to call static method 
		//1. direct calling
		mailRecieved();
		//2. By class name
		StaticAndNonStaticConcept.mailRecieved();
		//how to call static variables
		//1. direct calling 
		System.out.println(age);
		//2. By class name
		System.out.println(StaticAndNonStaticConcept.age);
		//To call non static method and variables we have to create object of class 
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sentMail();
		//We can access static method using object but warning as "Static method should be accessed in static way" will be given 
		obj.mailRecieved();
			
		
	}
	public void sentMail(){//non static method
		System.out.println("Mail sent");
	}
	public static void mailRecieved(){//static method
		System.out.println("Mail recieved");
	}
}
