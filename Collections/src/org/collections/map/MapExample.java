package org.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Subahn");
		student.put(2, "Suban");
		student.put(3, "Subhan");
		student.put(4, "Subahan");

		for (Map.Entry<Integer, String> entry : student.entrySet()) {
          System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
		}

		
		Iterator<Entry<Integer,String>> entry=student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer,String> tmp = entry.next();
			System.out.println("Key:"+tmp.getKey()+"Value:"+tmp.getValue());
			
		}
		
		
	}
}