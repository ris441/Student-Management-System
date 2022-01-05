package com.Management;

public class Student {
private int studentId;
private String studentName;
private String studentPhone;
private String studentCity;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentPhone() {
	return studentPhone;
}
public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String name, String phone, String city) {
	// TODO Auto-generated constructor stub
	setStudentName(name);
	setStudentPhone(phone);
	setStudentCity(city);
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
			+ ", studentCity=" + studentCity + "]";
}

}
