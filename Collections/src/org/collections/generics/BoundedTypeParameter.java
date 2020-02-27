package org.collections.generics;

class Data2<K extends Integer, V extends BoundedTypeParameter> {
	private K key;
	private V value;

	public Data2(K key, V value) {

		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

	public <E extends Character, N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + "Number: " + number);
	}

}

public class BoundedTypeParameter {

	public static void main(String[] args) {
     
		Data2<Integer,BoundedTypeParameter> data = new Data2<Integer,BoundedTypeParameter>(1,new BoundedTypeParameter());
		data.display('$', 383);
		data.getValue().test();
		data.getKey();
		
	}

	private void test() {
		System.out.println("Testing");
		
	}

}
