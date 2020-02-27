package org.collections.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}
	
	
}



public class GenericsSample {

	
	
	public static void main(String[] args) {
		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Subhan"));
		elements.add(new Data<Object>('&'));
		elements.add(new Data<Object>(1));
		elements.add(new Data<Object>(2.00d));
		elements.add(new Data<Object>(0.05f));
		
		GenericsSample example = new GenericsSample();
		example.display(elements);
		

	}

	void display(List<Data<Object>> list) {
		Iterator<Data<Object>> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println("Element : "+ iterator.next().getMyVariable());
		}
	}
	
	
	
}
