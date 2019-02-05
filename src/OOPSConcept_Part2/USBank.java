package OOPSConcept_Part2;

public interface USBank {
	
	//only method declaration, no method body 
	//in interface we can declare variable and variables are by default static in nature
	//value of variables can't be changed 
	//no static methods in interface. methods are non static in nature
	//no main method.
	//we can't create object of interface becouse they are abstract in nature
	int min_bal = 200;
	public void credit();
	
	public void debit();
	
	public void transfer_money();
	
	 

}
