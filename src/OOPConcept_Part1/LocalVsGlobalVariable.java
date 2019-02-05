package OOPConcept_Part1;

import org.omg.Messaging.SyncScopeHelper;

public class LocalVsGlobalVariable {
	
	//global or class variables 
	//Scope of below variable throughout programme  
	//below variables are non static variables 
	String name = "Tom";
	int age=25;
	
	public static void main(String[] args) {
	
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		int i=10;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(i);
		System.out.println();

	}
	public void sum(){
		int i=10;
		int j=20;
		int age=25;//we can create duplicate variable inside method as scope of this variable with in method
		
	}

}
