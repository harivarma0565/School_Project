package com.example.schools.Utils;

import java.time.LocalDateTime;
import java.util.List;

import com.example.schools.DTO.ModificationHistory;

public class CommonEntity {

	private String createdBy;
	private String createdRole;
	private LocalDateTime createdDate;
	private String lUpdatedBy;
	private String lUpdatedRole;
	private LocalDateTime lUpdatedDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedRole() {
		return createdRole;
	}

	public void setCreatedRole(String createdRole) {
		this.createdRole = createdRole;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getlUpdatedBy() {
		return lUpdatedBy;
	}

	public void setlUpdatedBy(String lUpdatedBy) {
		this.lUpdatedBy = lUpdatedBy;
	}

	public String getlUpdatedRole() {
		return lUpdatedRole;
	}

	public void setlUpdatedRole(String lUpdatedRole) {
		this.lUpdatedRole = lUpdatedRole;
	}

	public LocalDateTime getlUpdatedDate() {
		return lUpdatedDate;
	}

	public void setlUpdatedDate(LocalDateTime lUpdatedDate) {
		this.lUpdatedDate = lUpdatedDate;
	}

}
