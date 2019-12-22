package org.collections.list;

import java.util.LinkedList;
import java.util.List;

import org.collections.model.Employee;

public class LinkedListSample {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("abc");
		emp.setAddress("Vij");
		emp.setAge(8);
		
		List<Employee> listofemps=new LinkedList<>();
		listofemps.add(emp);
		
		Employee emp2=new Employee();
		emp2.setName("csd");
		emp2.setAddress("dffg");
		emp2.setAge(5);
		
		listofemps.add(emp2);
		
		for(Employee tmp: listofemps) {
			System.out.println("Name:"+tmp.getName()+" "+"Age:"+tmp.getAge()+" "+"Address:"+tmp.getAddress());
		}
	}

}
