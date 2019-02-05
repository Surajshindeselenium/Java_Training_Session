package javaBasics;

public class ConstructorConcept {
	//constructor used to initialize class properties 
	
	String name;
	int age;
	
	//A constructor in Java is a special method that is used to initialize objects. The constructor is 
	//called when an object of a class is created. It can be used to set initial values for object attributes.
	//We can overload the constructor.
	//Constructor doesn't return anything. It doesn't have return type
	
	public ConstructorConcept(){
		System.out.println("This is constructor");
	}
	public ConstructorConcept(int i){
		System.out.println("Single parameter constructor"  +i);
	}
	public ConstructorConcept(int i,int j){
		System.out.println("Single parameter constructor"  +i+j);
	}
	ConstructorConcept(String name, int age){
		//'this' keyword always refers to current class
		//this keyword is used then we have to initialize a class variables with local variable 
		//in below example this.name and this.age refers to class variable. So this.name = name expression will give "Suraj"
		//to class variable name and this.age= age will give 26 to class variable age.
		this.name=name;//this.class variable = local variable 
		this.age=age;////this.class variable = local variable
		
	}
	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("Suraj", 26);
		System.out.println(obj3.name);
		System.out.println(obj3.age);

	}

}
