package com.zensar.bus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passbooking")
public class BusPassMODL {

	@Id
	@Column(name="passId")
	private Integer passId;
	@Column(name="staffId")
	private Integer staffId;
	@Column(name="routeId")
	private Integer routeId;
	@Column(name="pointId")
	private Integer pointId;
	@Column(name="passType")
	private String passType;
	@Column(name="cost")
	private Integer cost;
	@Column(name="passStartDate")
	private Date passStartDate;
	@Column(name="passEndDate")
	private Date passEndDate;
	private String  passStatus;
	//private Integer StatusOfPass;

	public Integer getPassId() {
		return passId;
	}
	public void setPassId(Integer passId) {
		this.passId = passId;
	}
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public Integer getPointId() {
		return pointId;
	}
	public void setPointId(Integer pointId) {
		this.pointId = pointId;
	}
	public String getPassType() {
		return passType;
	}
	public void setPassType(String passType) {
		this.passType = passType;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Date getPassStartDate() {
		return passStartDate;
	}
	public void setPassStartDate(Date passStartDate) {
		this.passStartDate = passStartDate;
	}
	public Date getPassEndDate() {
		return passEndDate;
	}
	public void setPassEndDate(Date passEndDate) {
		this.passEndDate = passEndDate;
	}
	public String getPassStatus() {
		return passStatus;
	}

	public void setPassStatus(String status) {
		this.passStatus = status;
	}
	

}
