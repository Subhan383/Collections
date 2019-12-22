package org.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(0, "abc");
		list.add(1, "ac");
		list.add(2, "bc");
		list.add(3, "ab");
		list.add(4, "abce");

		for (String tmp : list) {
			System.out.println(tmp);
		}

	}
}
