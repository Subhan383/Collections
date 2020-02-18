package org.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SortingofList {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();
		places.add("Ooty");
		places.add("Kodaikenal");
		places.add("Baali");
		places.add("Coorg");
		places.add("Kashmir");
		
		SortingofList example = new SortingofList();
		example.displayPlaces(places);
		System.out.println("**************");
		//places.sort(null);
		//Collections.reverse(places);
		//System.out.println("**************");
		Collections.reverse(places);
		example.displayPlaces(places);

	}

	void displayPlaces(List<String> place) {
		ListIterator<String> iterator=place.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Places :"+iterator.next());
		}
		
	}
	  
	
	
	
}



