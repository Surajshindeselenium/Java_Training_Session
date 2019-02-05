package absreactionConcept;

public class Test_Car {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafty();
		//Dynamic polymorprism 
		Car bb=new BMW();
		bb.start();
		bb.stop();
		bb.refuel();
		
	}

}
