package com.Management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
	
public static void main (String [] args) throws  IOException {
	
	System.out.println("Wel-Come in the Student Management System ");
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	while(true) {
		System.out.println("Press 1 to Add Student ");
		System.out.println("Press 2 to Delete Student ");
		System.out.println("Press 3 to Display Student ");
		System.out.println("Press 4 to Update student phone  ");
		System.out.println("press 5 to exit");
		int c = Integer.parseInt(br.readLine());
		switch(c) {
		case 1:
			//add student 
			System.out.println("Enter the Name : ");
			String name = br.readLine();
			System.out.println("Enter the Phone : ");
			String phone = br.readLine();
			System.out.println("Enter the City : ");
			String city = br.readLine();
			Student st = new Student(name ,phone,city);
			boolean answer = StudentDao.insertStudenttoDataBase(st);
			if(answer) {
				System.out.println("Student is added Successfully ....");
				
			}
			else {
				System.out.println("Something went Wrong try again !!!");
			}
			
			System.out.println(st);
			
			break;
		case 2:
			// delete student 
			System.out.println("Enter the id of the student Which you want to "
					+ "delete from the students List :");
			String id ;
			 id=br.readLine() ;
			 boolean delans = StudentDao.deleteStudentToDataBase(id);
			 if(delans) {
					System.out.println("Student is Deleted Successfully ....");
					
				}
				else {
					System.out.println("Something went Wrong try again !!!");
				}
			break;
		case 3:
			// display students 
			StudentDao.displayStudentToDataBase();
			break;
		case 4: 
			
		//	System.out.println("Update option is available SOON .......");
			
		//	/*
			System.out.println("Enter the name : ");
			 String stnm  = br.readLine();
			System.out.println("Enter the updated phone  ");
			String uphone = br.readLine();
			boolean up = StudentDao.UpdateStudentToDataBase(stnm,uphone);
			if(up ==  true ) {
				System.out.println("Updation is successful....");
				
			}
			else {
				System.out.println("Something went Wrong try again !!!");
			}
			//*/
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Some error in Choice please Try Again ");
		
		}
		
	}
}
}
