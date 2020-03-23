package com.zensar.bus.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class RouteMODL {

	@Id
	private Integer routeId;
	private String routeName;
	private Integer availableSeat;
	private boolean status;
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Integer getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(Integer availableSeat) {
		this.availableSeat = availableSeat;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
