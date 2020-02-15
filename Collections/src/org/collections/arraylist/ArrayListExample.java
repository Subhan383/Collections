package org.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	static ArrayList<String> listofNames = new ArrayList<>();

	public static void main(String[] args) {

		listofNames.add("Subhan");
		listofNames.add("Shaik");
		listofNames.add("Sailaja");
		listofNames.add("Kethavath");
		listofNames.add("Vamsi");
		listofNames.add("Naik");
		ArrayListExample example = new ArrayListExample();
		
		example.displayNames(listofNames);
		System.out.println("*************");
		int position=example.search("Sailaja");
		System.out.println(position);
		System.out.println("*************");
		example.displayNames(listofNames);
		example.removeByPosition(3);
		System.out.println("**************");
		example.displayNames(listofNames);
		example.removeByName("Vamsi");
		example.removeByName("Naik");
		System.out.println("*************");
		example.displayNames(listofNames);
		System.out.println("********");
		example.modifyByName(2, "Kanna");
		example.displayNames(listofNames);
	
	}

	void displayNames(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	void removeByPosition(int position) {
		listofNames.remove(position);
	}

	void removeByName(String name) {
		listofNames.remove(name);
	}

	void modifyByName(int position, String name) {
		listofNames.set(position, name);
	}

	int search(String name) {
		return listofNames.indexOf(name);
	}

}
