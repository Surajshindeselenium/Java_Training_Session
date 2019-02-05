package OOPConcept_Part1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;
	public static void main(String[] args) {
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int a=obj.testsum(100,50);//This is called call by value or pass by value
		System.out.println(a);
		obj.p=100;
		obj.q=200;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	public int testsum(int a,int b){
		
		int c=a+b;
		return c;
	}
	//call by reference 
	public void swap(CallByValueAndCallByReference t){
		
		int temp;
		temp=t.p;//temp=100
		t.p=t.q;//p=200
		t.q=temp;//q=100
		
	}

}
