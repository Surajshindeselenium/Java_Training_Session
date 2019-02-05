package absreactionConcept;

public interface Car {
	//in interface we can only define final and static variable. No need to mention 'static' keyword
	int wheel = 4;//here it will considered as static variable by default
	final int velocity=150;
	static double price = 6.8;
	
	//in Interface, we have to achieve full abstraction
	//in interface, all methods are abstract in nature. No need to mention abstract keyword also
	//abstract method means no method body. Only method declaration 
	//We can't create object of interface classes."Car cr = new Car();" This is not allowed 
	
	
	public void start();
	public void stop();
	public void refuel();

}
