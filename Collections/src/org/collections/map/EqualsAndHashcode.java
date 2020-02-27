package org.collections.map;

class Code2 implements Comparable<Code2> {
	private String sectionNo;
	private String lectureNo;

	public Code2(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code2 other = (Code2) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public int compareTo(Code2 o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo() + o.getLectureNo();
		return code1.compareTo(code2);
	}

}

public class EqualsAndHashcode {

	public static void main(String[] args) {
		Code2 code1=new Code2("S01","L02");
		Code2 code2=new Code2("S01","L03");
		
		System.out.println("Section No hashcode:"+code1.hashCode()+"Lecture No:"+code2.hashCode());
		System.out.println(code1.equals(code2));

	}

}
