package OOPSConcept_Part2;

public class HSBCBank implements USBank,BrazilBank {//we are achiving multiple inharitance 
	
	public void credit(){
		System.out.println("HSBC Credit defination");
	}
	public void debit (){
		System.out.println("HSBC debit defination");
	}
	public void transfer_money(){
		System.out.println("HSBC transfer money defination");
	}
	public void education_loan(){
		System.out.println("HSBC education defination");
		
	}
	public void car_loan(){
		System.out.println("HSBC car loan");
	}
	public void mutual_fund(){
		System.out.println("brazil bank mutual fund");
	}

}
