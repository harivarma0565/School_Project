package com.example.schools.DTO;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.schools.Utils.CommonEntity;

@Entity
@Table(name = "Contact_Details", schema = "School")
public class ContactDetailsDTO extends CommonEntity{

	private String userId;
	private String mobileNo;
	private String alternateMobileNo;
	private String emailId;
	private String facebookId;
	private String websiteName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAlternateMobileNo() {
		return alternateMobileNo;
	}

	public void setAlternateMobileNo(String alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	@Override
	public String toString() {
		return "ContactDetailsDTO [userId=" + userId + ", mobileNo=" + mobileNo + ", alternateMobileNo="
				+ alternateMobileNo + ", emailId=" + emailId + ", facebookId=" + facebookId + ", websiteName="
				+ websiteName + "]";
	}

}
