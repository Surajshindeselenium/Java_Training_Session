package OOPSConcept_Part2;

public class TestCar {

	public static void main(String[] args) {
		//static or compile time polymorphism 
		BMW obj1=new BMW();
		obj1.start();//overridden method hence it will give preference to child class method 
		obj1.stop();
		obj1.refuel();
		obj1.engine();
		System.out.println("******************");
		Car obj2 = new Car();
		obj2.start();
		obj2.stop();
		System.out.println("******************");
		Car obj3=new BMW();//child class can be referred by parent class reference variable. This is called dynamic or runtime polymorphism  
		obj3.start();
		obj3.stop();
		obj3.refuel();
		
		
		
	}

}
