package org.collections.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> countries=new LinkedList<>();
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Greenland");
		countries.add("Poland");
		countries.add("Newzeland");
		countries.add("Switzerland");
		countries.add("Finland");

		LinkedListExample example = new LinkedListExample();
		example.display(countries);
		countries.set(0, "Thailand");
		countries.add(5, "Iceland");
		countries.remove(1);
		example.display(countries);
		
		
	}
	void display(LinkedList<String> list) {
		for(String names: list) {
			System.out.println(names);
		}
	    System.out.println("************");
	}
	

}
