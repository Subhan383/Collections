package org.collections.map;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code> {

	private String sectionNo;
	private String lectureNo;

	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1=sectionNo.concat(lectureNo);
		String code2=o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}

}

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Code,String> map=new TreeMap<Code,String>();
		map.put(new Code("S1","L2"), "Subhan");
		map.put(new Code("S1","L3"), "Siva");
		map.put(new Code("S4","L5"), "Sriram");
		map.put(new Code("S1","L2"), "Sai");
		map.put(new Code("S3","L4"), "Sakthi");
		map.put(new Code("S3","L2"), "Soban");
		
		Code code=null;
		for(Map.Entry<Code,String> entry : map.entrySet()) {
			System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
			if(entry.getValue().equals("Sriram")) {
				code=entry.getKey();
			}
			
		}
		System.out.println("The Key for value \"Sriram\":"+code);
		System.out.println("Searching the required entry value:"+map.get(new Code("S1","L2")));
		
	}

	
	
	
}
