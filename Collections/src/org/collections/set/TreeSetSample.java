package org.collections.set;

import java.util.Set;
import java.util.TreeSet;



public class TreeSetSample {

	public static void main(String[] args) {
	
		
		
		Set<String> setoftree=new TreeSet<>();
		setoftree.add("abc");
		setoftree.add("bcd");
		setoftree.add("abc");
		
		for(String tmp: setoftree) {
			System.out.println(tmp);
		}
		
		

	}

}
