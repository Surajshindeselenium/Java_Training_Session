package OOPSConcept_Part2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("Suraj");
		//System.out.println(ar.get(2));
		for(int i=0;i<ar.size();i++){
		System.out.println(ar.get(i));	
		}
	}

}
