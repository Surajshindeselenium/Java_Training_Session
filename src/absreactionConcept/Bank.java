package absreactionConcept;

public abstract class Bank {
	//creating below variable is allowed in abstract class
	int amt = 1000;
	final int rate=50;
	static double loanrate = 6.8;
	//abstract class defined by 'abstract' keyword
	//for abstract class it is mandatory to define at least one abstract method.
	//abstract method is only method prototype no method body.
	//hiding implementation logic means abstraction 
	//this is example of partial abstraction because here we have one abstract method and two non abstract methods 
	
	public abstract void loan(); // abstract method--no method body
	
	public void credit(){//non abstract method 
		System.out.println("Credit method");
	}
	public void debit(){////non abstract method
		System.out.println("debit method");
	}

}
