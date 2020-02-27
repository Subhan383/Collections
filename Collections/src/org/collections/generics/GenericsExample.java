package org.collections.generics;



class Generic<T> {
	private T data;

	public Generic(T data) {

		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}

}


public class GenericsExample {

	
	public static void main(String[] args) {
		Generic<String> generics= new Generic<String>("Subhan");
		String data=generics.getData();
		System.out.println(data);

	}

}
