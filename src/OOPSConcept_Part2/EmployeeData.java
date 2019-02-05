package OOPSConcept_Part2;

/*Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a 
single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through 
the methods of their current class. Therefore, it is also known as data hiding*/

public class EmployeeData {
	
	//How to implement Encapsulation: 
	//1. create private data variables so that variables can't be accessed from outside of the class 
	private int ssn;
	private String empname;
	private int empage;
	
	public static void main(String[] args) {
		
		EmployeeData obj = new EmployeeData();
		obj.setEmpname("Suraj Shinde");
		obj.setSsn(256548531);
		obj.setEmpage(25);
		System.out.println("Employee name: "+obj.getEmpname());
		System.out.println("Employee age:"+obj.getEmpage());
		System.out.println("SSN No. is:"+obj.getSsn());
		
		
	}
	//2. create public getter and setter methods to get and set values of the fields 
	//getter and setter methods should be define as public 
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}
}
