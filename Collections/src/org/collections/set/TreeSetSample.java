package org.collections.set;

import java.util.Set;
import java.util.TreeSet;

import org.collections.model.Student;

public class TreeSetSample {

	public static void main(String[] args) {
	
		Student std1=new Student();
		std1.setClassName("10th Class");
		std1.setMarks(383);
		std1.setRollNumber(518);
		
		Set<Student> setoftree=new TreeSet<>();
		setoftree.add(std1);
		
		Student std2=new Student();
		std2.setClassName("Inter");
		std2.setMarks(896);
		std2.setRollNumber(562);
		
		setoftree.add(std2);
		
		for(Student tmp: setoftree) {
			System.out.println("class is:"+tmp.getClassName()+" "+"Scored Marks are:"+tmp.getMarks()+" "+"RollNumber Is:"+tmp.getRollNumber());
			
		}
		

	}

}
