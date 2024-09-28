package main.dto;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer sId;
	private String sName;
	private Integer sAge;
	private String sAddress;
	
	
//	public Student(Integer sId, String sName, Integer sAge, String sAddress) {
//		this.sId = sId;
//		this.sName = sName;
//		this.sAge = sAge;
//		this.sAddress = sAddress;
//	}


	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}


	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}


	public Integer getsId() {
		return sId;
	}


	public String getsName() {
		return sName;
	}


	public Integer getsAge() {
		return sAge;
	}


	public String getsAddress() {
		return sAddress;
	}


	@Override
	public String toString() {
		return "Student [Id=" + sId + ", Name=" + sName + ", Age=" + sAge + ", Address=" + sAddress + "]";
	}
	
	
	
}
