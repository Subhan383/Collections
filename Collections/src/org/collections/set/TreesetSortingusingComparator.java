package org.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V> {
	private Integer key;
	private String value;

	public Data(Integer key, String value) {

		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

}

public class TreesetSortingusingComparator {
	public static void main(String[] args) {

		Comparator<Data<Integer, String>> Compare_Number = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		
		
		Comparator<Data<Integer,String>> Compare_Name = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getValue().length()<obj2.getValue().length()) {
					return -1;
				}else if(obj1.getValue().length()>obj2.getValue().length()) {
					return 1;
				}else {
				return 0;
				}
			}
			
		};
		

		Set<Data<Integer, String>> set = new TreeSet<Data<Integer, String>>(Compare_Name);
		set.add(new Data<Integer, String>(1, "Subhan"));
		set.add(new Data<Integer, String>(2, "Sailaja"));
		set.add(new Data<Integer, String>(3, "Razaq"));
		set.add(new Data<Integer, String>(6, "Raziya"));
		set.add(new Data<Integer, String>(7, "Basha"));

		for (Data element : set) {
			System.out.println(element);
		}

	}

}
