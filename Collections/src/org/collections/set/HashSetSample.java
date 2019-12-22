package org.collections.set;

import java.util.HashSet;
import java.util.Set;

import org.collections.model.Employee;

public class HashSetSample {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("abc");
		emp.setAddress("Vij");
		emp.setAge(8);
		
		Set<Employee> set=new HashSet<>();
		set.add(emp);
		
		Employee emp2=new Employee();
		emp2.setName("csd");
		emp2.setAddress("Vij");
		emp2.setAge(5);
		
		set.add(emp2);
		

		for(Employee tmp: set) {
			System.out.println("Name:"+tmp.getName()+" "+"Age:"+tmp.getAge()+" "+"Address:"+tmp.getAddress());
		    System.out.println(tmp.hashCode());
		}
		
		
		
		
	}

}
