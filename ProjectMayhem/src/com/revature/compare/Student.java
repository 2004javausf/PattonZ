package com.revature.compare;

public class Student implements Comparable<Student>{
	//1st method of comparing - Implement Comparable
	private int studentID;
	private String labels;
	private double gpa;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String labels, double gpa) {
		super();
		this.studentID = studentID;
		this.labels = labels;
		this.gpa = gpa;
	}
	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getLabels() {
		return labels;
	}


	public void setLabels(String labels) {
		this.labels = labels;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", labels=" + labels + ", gpa=" + gpa + "]";
	}
	//compare Student ID
	@Override
	public int compareTo(Student arg0) {
		return this.getStudentID()-arg0.getStudentID();
	}
	


	
}
