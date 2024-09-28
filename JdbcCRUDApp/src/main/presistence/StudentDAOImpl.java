package main.presistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

import main.util.Util;

import main.dto.Student;

public class StudentDAOImpl implements IStudentDAO {

	Connection c = null;
	PreparedStatement p = null; 
	ResultSet r = null;
	
	Scanner s = null;
	@Override
	public String addStudent(String sName, Integer sAge, String sAddress) {
		
		try {
			c = Util.getConnection();
			
			String insertQ = "insert into student(`sname`, `sage`, `saddress`) values(?, ?, ?)";
			if(c!=null) {
				p= c.prepareStatement(insertQ);
			}
			
			if(p!=null) {
				p.setString(1, sName);
				p.setInt(2, sAge);
				p.setString(3, sAddress);
				
				int rowsAffected = p.executeUpdate();
				
				if(rowsAffected == 1) {
					return "success";
				}
			}
		}catch(Exception e) {
			System.out.println();
		}
		return null;
	}

	@Override
	public Student searchStudent(Integer sId) {
		
		try {
			c = Util.getConnection();
			String selectQ = "select id, sname, sAge, sAddress from student where `id` = ?";
			if(c!=null) {
				p = c.prepareStatement(selectQ);
			}
			
			p.setInt(1, sId);
			
//			p.execute();
			
			r = p.executeQuery();
			
			
			if(r!=null) {
				Student ss = null;
				if(r.next()) {
					ss = new Student();
					
					ss.setsId(r.getInt(1));
					ss.setsName(r.getString(2));
					ss.setsAge(r.getInt(3));
					ss.setsAddress(r.getString(4));
					
					return ss;
				}
			}
			

		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateStudent(Integer sId, String sName, Integer sAge, String sAddress) {
		try {
			c = Util.getConnection();
			String updateQ = "update student set `sname` = ?, `sAge` = ?, `sAddress` = ?  where `id` = ?";
			if(c!=null) {
				p = c.prepareStatement(updateQ);
				
			}
			
			if(p!=null) {
			
				
				p.setInt(4, sId);
				p.setString(1, sName);
				p.setInt(2, sAge);
				p.setString(3, sAddress);	
			}
			
			Integer rowsAffected = p.executeUpdate();
			
			if(rowsAffected == 1) {
				return "success";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteStudent(Integer sId) {
		try {
			c = Util.getConnection();
			
			String deleteQ = "delete from student where id = ?";
			if(c!=null) {
				
				p = c.prepareStatement(deleteQ);
			}
			
			if(p!=null) {
				p.setInt(1, sId);
			}
			
			Integer rowsAffected = p.executeUpdate();
			
			if(rowsAffected == 1) {
				return "success";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
