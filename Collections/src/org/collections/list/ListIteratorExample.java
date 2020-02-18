package org.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIteratorExample {

	static List<String> names=new LinkedList<>();
	
	public static void main(String[] args) {

     
     names.add("SIva");
     names.add("Vali");
     names.add("Sriram");
     names.add("Imran");
     
     ListIteratorExample example=new ListIteratorExample();
     example.display(names);
     System.out.println("***************");
     example.replaceByPosition(0, "Siva");
     names.remove(1);
     System.out.println("***************");
     names.add("Nagoor Vali");
     example.display(names);
	}

	void display(List<String> names) {
		
		Iterator<String> iterator= names.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}
	
	void replaceByPosition(int position, String name) {
		names.set(position,name);
		
	}
	
	
	
}
