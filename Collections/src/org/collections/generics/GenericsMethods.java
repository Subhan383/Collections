package org.collections.generics;

import java.util.ArrayList;
import java.util.List;

class GenericData{
	public  <E> void displayListData(List<E> listdata){
		for(E element: listdata) {
			System.out.println(element);
		}
	}

  public <E> void displayArrayData(E[] arraydata) {
	  for(E element: arraydata) {
		  System.out.println(element);
	  }
  }


}


public class GenericsMethods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		GenericData data = new GenericData();
		System.out.println("Displaying List Type of Data");
		System.out.println("****************");
		data.displayListData(list);
		System.out.println("****************");
		data.displayListData(list2);
		System.out.println("****************");
		System.out.println("Displaying Array Type of Data");
		
		String[] stringarray= {"one","two","three","four"};
		Integer[] integerarray= {1,2,3,4};
		System.out.println("****************");
		data.displayArrayData(stringarray);
		System.out.println("****************");
		data.displayArrayData(integerarray);
		
		
	}

}
