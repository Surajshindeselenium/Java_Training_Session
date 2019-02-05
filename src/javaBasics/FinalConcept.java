package javaBasics;

public class FinalConcept {

	public static void main(String[] args) {
		//final keyword used to define constant values. 
		//In below example int i=10 can't be changed its defined final 
		//To avoid inheritance we user final keyword. e.g: public final class Parent class{}
		//To avoid, method overriding. If we declare any method final then it can't be overriddenE.g: public final void start()
		
		final int i=10;
		System.out.println(i);
		
		
	}

}
