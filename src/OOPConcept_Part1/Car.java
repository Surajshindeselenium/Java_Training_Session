package OOPConcept_Part1;

public class Car {
	//class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car()-- is the object of car class 
		//obj1,obj2 and obj3 are object reference variables 
		//here, copy of int mod and int wheel will be given to all three object 
		Car obj1= new Car();
		Car obj2= new Car();
		Car obj3= new Car();
		https://marketplace.eclipse.org/content/natural
		//here,mod=2015 and wheel=4 will be given to obj1
		obj1.mod= 2015;
		obj1.wheel=4;
		https://marketplace.eclipse.org/content/natural
		obj2.mod= 2016;
		obj2.wheel=4;http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2427135
		
		obj3.mod= 2017;
		obj3.wheel=2;
		System.out.println(obj1.mod);
		System.out.println(obj2.wheel);
	}

}
