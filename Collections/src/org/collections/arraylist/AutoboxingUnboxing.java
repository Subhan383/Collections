package org.collections.arraylist;

import java.util.ArrayList;

/**@throws Exception
 * @author subhan
 *
 */
public class AutoboxingUnboxing {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(383);
		list.add(485);
		list.add(355);
		try {
		System.out.println(list.get(2));
		}catch(Exception e) {
        	 System.out.println("Please mention the index within the specified range");
         }
		
		ArrayList<Float> list1=new ArrayList<>();
		list1.add(2.0f);
		list1.add(3.0f);
		list1.add(2.0f);
		list1.add(2.0f);
		
		try {
			System.out.println(list1.get(3));
		}catch(Exception e){
			System.out.println("Please mention the index within the specified range");
		}
		
		ArrayList<Double> list2=new ArrayList<>();
		list2.add(1.0d);
		list2.add(3.0d);
		list2.add(4.0d);
		list2.add(6.0d);
		
		try {
			System.out.println(list2.get(0));
		}catch(Exception e){
			System.out.println("Please mention the index within the specified range");
		}
		
		
	}

	
}
