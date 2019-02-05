package absreactionConcept;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW ---- Start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW ----- Stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW ----- Refuel");
		
	}
	//non overridden method 
	public void theftsafty(){
		System.out.println("BMW theft safety method");
	}
	
	

}
