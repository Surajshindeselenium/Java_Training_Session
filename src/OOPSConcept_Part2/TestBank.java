package OOPSConcept_Part2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank ob = new HSBCBank();
		
		ob.credit();
		ob.debit();
		ob.transfer_money();
		ob.car_loan();
		ob.education_loan();
		//dynamic polymorprism
		//child class object can be can be referred by parent interface reference variable 
		USBank b=new HSBCBank();
		b.credit();
		//you can't access interface variable directly, you have to access it by interface or class name.
		System.out.println(USBank.min_bal);
		System.out.println(HSBCBank.min_bal);
		ob.mutual_fund();
	}

}
