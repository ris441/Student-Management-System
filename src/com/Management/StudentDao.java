package com.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class StudentDao {
	public static boolean  insertStudenttoDataBase(Student st ) {
	boolean f=false;
		try {
			//jdbc code
			Connection con = CP.createC();
			String q = "insert into students(sname,sphone,scity)values(?,?,?);";
			// PreparedStatement 
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			
			pstmt.executeUpdate();
			f=true;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	return f;	
	}
	public static boolean deleteStudentToDataBase(String userId)  {
		boolean f=false;
		try {
			//jdbc code
			Connection con = CP.createC();
			String q = "delete from students where sid=?";
			// PreparedStatement 
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1,userId);
			
			
			pstmt.executeUpdate();
			f=true;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	return f;	
	
	}

	public static void displayStudentToDataBase()  {
		
		try {
			//jdbc code
			Connection con = CP.createC();
			String q = "select * from students ;";
			// Statement 
			
			
			Statement stmt=(Statement) con.createStatement();
			ResultSet set= stmt.executeQuery(q);


			System.out.println("**********************************");
			System.out.println("*                                *");
			System.out.println("*   -:  Details of student :-    *");System.out.println("*                                *");
			while(set.next()) {
			
			
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);

			System.out.println("**********************************");
			System.out.println("Student id : "+ id );
			System.out.println("Student name : "+name);
			System.out.println("Student phone : "+ phone);
			System.out.println("Student Address : "+city );
			System.out.println("**********************************");
			
			
			}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		// update function
		public static boolean UpdateStudentToDataBase(String userId,String phone)  {
			boolean f=false;
			try {
				//jdbc code
				//String p1= "000000000";
				Connection con = CP.createC();
				String sql = "update students set sphone = ? where sname = ?;";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, phone);
				pstmt.setString(2, userId);
				pstmt.executeUpdate();
				f=true;
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		return f;	
		
		}
	
	
	

}
