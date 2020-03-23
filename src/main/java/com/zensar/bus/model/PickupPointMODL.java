package com.zensar.bus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pickuppoint")
public class PickupPointMODL {
@Id
private Integer pointId;
private String pointName;
private Integer routeId;
private Integer monthlyCost;
private Integer weeklyCost;
private Integer dailyCost;
public Integer getPointId() {
	return pointId;
}
public void setPointId(Integer pointId) {
	this.pointId = pointId;
}
public String getPointName() {
	return pointName;
}
public void setPointName(String pointName) {
	this.pointName = pointName;
}
public Integer getRouteId() {
	return routeId;
}
public void setRouteId(Integer routeId) {
	this.routeId = routeId;
}
public Integer getMonthlyCost() {
	return monthlyCost;
}
public void setMonthlyCost(Integer monthlyCost) {
	this.monthlyCost = monthlyCost;
}
public Integer getWeeklyCost() {
	return weeklyCost;
}
public void setWeeklyCost(Integer weeklyCost) {
	this.weeklyCost = weeklyCost;
}
public Integer getDailyCost() {
	return dailyCost;
}
public void setDailyCost(Integer dailyCost) {
	this.dailyCost = dailyCost;
}

}
