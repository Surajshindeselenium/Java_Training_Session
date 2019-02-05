package OOPSConcept_Part2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h= new Hashtable();
		h.put("A", "Suraj");
		h.put("B", "M");
		h.put("C", "Shinde");
		h.put("1", 100);
		System.out.println(h.size());
		System.out.println(h.get("A"));
		System.out.println(h.get("1"));
	}

}