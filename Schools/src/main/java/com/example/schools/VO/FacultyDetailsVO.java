package com.example.schools.VO;

import java.util.List;

public class FacultyDetailsVO {
	private String userId;
	private String facultyName;
	private String contactNo;
	private String designation;
	private String qualification;
	private String facultyId;
	private List<String> dealingSubjects;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public List<String> getDealingSubjects() {
		return dealingSubjects;
	}

	public void setDealingSubjects(List<String> dealingSubjects) {
		this.dealingSubjects = dealingSubjects;
	}
}
