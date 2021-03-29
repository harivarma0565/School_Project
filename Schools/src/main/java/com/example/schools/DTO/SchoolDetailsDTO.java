package com.example.schools.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.schools.Utils.CommonEntity;

@Entity
@Table(name = "School_Details", schema = "School")
public class SchoolDetailsDTO extends CommonEntity {

	@Id
	private int userId;
	private String instituteName;
	private String instituteHead;
	private Integer establishedYear;
	private String panNumber;
	private AddressDetailsDTO addressDetails;
	private ContactDetailsDTO contactDetails;
	private String facultyCount;
	private int busCount;
	private String status;
	private Boolean isMainBranch;
	private String mainBranchName;
	private String isReActivated;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteHead() {
		return instituteHead;
	}

	public void setInstituteHead(String instituteHead) {
		this.instituteHead = instituteHead;
	}

	public Integer getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(Integer establishedYear) {
		this.establishedYear = establishedYear;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public AddressDetailsDTO getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetailsDTO addressDetails) {
		this.addressDetails = addressDetails;
	}

	public ContactDetailsDTO getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetailsDTO contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getFacultyCount() {
		return facultyCount;
	}

	public void setFacultyCount(String facultyCount) {
		this.facultyCount = facultyCount;
	}

	public int getBusCount() {
		return busCount;
	}

	public void setBusCount(int busCount) {
		this.busCount = busCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsMainBranch() {
		return isMainBranch;
	}

	public void setIsMainBranch(Boolean isMainBranch) {
		this.isMainBranch = isMainBranch;
	}

	public String getMainBranchName() {
		return mainBranchName;
	}

	public void setMainBranchName(String mainBranchName) {
		this.mainBranchName = mainBranchName;
	}

	public String getIsReActivated() {
		return isReActivated;
	}

	public void setIsReActivated(String isReActivated) {
		this.isReActivated = isReActivated;
	}

	@Override
	public String toString() {
		return "SchoolDetailsDTO [userId=" + userId + ", instituteName=" + instituteName + ", instituteHead="
				+ instituteHead + ", establishedYear=" + establishedYear + ", panNumber=" + panNumber
				+ ", addressDetails=" + addressDetails + ", contactDetails=" + contactDetails + ", facultyCount="
				+ facultyCount + ", busCount=" + busCount + ", status=" + status + ", isMainBranch=" + isMainBranch
				+ ", mainBranchName=" + mainBranchName + ", isReActivated=" + isReActivated + "]";
	}

}
