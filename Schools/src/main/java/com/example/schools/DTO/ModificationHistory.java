package com.example.schools.DTO;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Modifications", schema = "School")
public class ModificationHistory {

	@Id
	private String id;
	private String userId;
	private String modifiedFieldName;
	private String modifiedBy;
	private String modifiedRole;
	private LocalDateTime modifiedDate;
	private String reason;
	private String oldValue;
	private String tableName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getModifiedFieldName() {
		return modifiedFieldName;
	}

	public void setModifiedFieldName(String modifiedFieldName) {
		this.modifiedFieldName = modifiedFieldName;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedRole() {
		return modifiedRole;
	}

	public void setModifiedRole(String modifiedRole) {
		this.modifiedRole = modifiedRole;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return "ModificationHistory [id=" + id + ", userId=" + userId + ", modifiedFieldName=" + modifiedFieldName
				+ ", modifiedBy=" + modifiedBy + ", modifiedRole=" + modifiedRole + ", modifiedDate=" + modifiedDate
				+ ", reason=" + reason + ", oldValue=" + oldValue + ", tableName=" + tableName + "]";
	}

}
