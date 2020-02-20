package org.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ComparableInterface {

	/**
	 * @author subhan
	 *
	 */
	class Names implements Comparable<Names> {
		private String name;

		public Names(String name) {
			super();
			this.name = name;
		}

		@Override
		public int compareTo(Names obj) {
			if (name.length() == obj.name.length()) {
				return 0;
			} else if (name.length() < obj.name.length()) {
				return -1;
			} else
				return 1;
		}

		@Override
		public String toString() {
			return name;
		}

	}

	public static void main(String[] args) {
		List <String>names=new LinkedList<>();
		names.add("Subhan");
		names.add("Gopi");
		names.add("Sriram");
		names.add("Imran");
		names.add("Vali");
		names.add("Siva");
		
		ComparableInterface example = new ComparableInterface();
        example.displayNames(names);
        Collections.sort(names);
        System.out.println("*************");
        example.displayNames(names);
	}

	public void displayNames(List<String> names) {
		ListIterator<String> iterator = names.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Your name is: "+iterator.next());
		}
	}
	
	
	
}
