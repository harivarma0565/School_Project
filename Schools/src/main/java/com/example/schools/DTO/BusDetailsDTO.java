package com.example.schools.DTO;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.schools.Utils.CommonEntity;

@Entity
@Table(name = "Bus_Details", schema = "School")
public class BusDetailsDTO extends CommonEntity{
	private String userId;
	private String vehicleNo;
	private String fromRoute;
	private String toRoute;
	private String driverName;
	private String driverContactNo;
	private String driverDLNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getFromRoute() {
		return fromRoute;
	}

	public void setFromRoute(String fromRoute) {
		this.fromRoute = fromRoute;
	}

	public String getToRoute() {
		return toRoute;
	}

	public void setToRoute(String toRoute) {
		this.toRoute = toRoute;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverContactNo() {
		return driverContactNo;
	}

	public void setDriverContactNo(String driverContactNo) {
		this.driverContactNo = driverContactNo;
	}

	public String getDriverDLNo() {
		return driverDLNo;
	}

	public void setDriverDLNo(String driverDLNo) {
		this.driverDLNo = driverDLNo;
	}

	@Override
	public String toString() {
		return "BusDetailsDTO [userId=" + userId + ", vehicleNo=" + vehicleNo + ", fromRoute=" + fromRoute
				+ ", toRoute=" + toRoute + ", driverName=" + driverName + ", driverContactNo=" + driverContactNo
				+ ", driverDLNo=" + driverDLNo + "]";
	}

}
