package com.example.schools.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.schools.Utils.CommonEntity;

@Entity
@Table(name = "Address_Details", schema = "School")
public class AddressDetailsDTO extends CommonEntity{

	private String userId;
	private String area;
	private List<String> streetName;
	private String city;
	private String mandalName;
	private String districtName;
	private String state;
	private Integer pinCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<String> getStreetName() {
		return streetName;
	}

	public void setStreetName(List<String> streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "AddressDetailsDTO [userId=" + userId + ", area=" + area + ", streetName=" + streetName + ", city="
				+ city + ", mandalName=" + mandalName + ", districtName=" + districtName + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}

}
