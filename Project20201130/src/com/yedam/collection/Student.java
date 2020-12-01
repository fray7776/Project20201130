package com.yedam.collection;

public class Student implements Comparable<Student> {
	private int studentNo;
	private String studentName;
	private int score;
	
	public Student(int studentNo, String studentName) {
		this.studentName = studentName;
	    this.studentNo = studentNo;
	}

	public Student(int studentNo, String studentName, int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		boolean b1 = this.studentName.equals(student.studentName);
		boolean b2 = this.studentNo== student.studentNo;
		return b1 && b2;
	}

	@Override
	public int hashCode() {
		return this.studentName.hashCode() + this.studentNo;
	}

	@Override
	public int compareTo(Student o) { //리턴값이 음수이면 오름차순, 0이면 같다, 양수이면 내림차순
//		return this.studentNo - o.studentNo;
//		return o.studentNo - this.studentNo;
		return o.score - this.score; //점수가 큰 사람부터 정렬
	}

}
