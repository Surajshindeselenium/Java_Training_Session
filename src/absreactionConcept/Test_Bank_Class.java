package absreactionConcept;

public class Test_Bank_Class {

	public static void main(String[] args) {
		HDFC_Bank obj = new HDFC_Bank();
		obj.credit();
		obj.debit();
		obj.loan();
		obj.funds();
		//we can achieve dynamic polymorphrism 
		//in below example we  have created object of HDFC_Bank class and which is referred by Bank class
		Bank b = new HDFC_Bank();
		b.credit();
		b.debit();
		b.loan();
		//In below example, we can't access funds method by object of HDFC_Bank class and which is referred by Bank class because funds() method separately defined by in HDFC_Bank class
		//b.funds();
		
		//We can't create object of abstract classes. This is not allowed 
		//Bank bk = new Bank();
	}

}
