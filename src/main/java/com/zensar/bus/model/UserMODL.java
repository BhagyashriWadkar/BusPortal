package com.zensar.bus.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.zensar.bus.exception.ValidPassword;



@Entity
@Table(name="user")
public class UserMODL {
@Id
private Integer staffId;
private String userName;
@ValidPassword
private String encryptedToken;
private boolean active;
private Timestamp addStamp;
private Timestamp updateStamp;
private boolean isAdmin;
public Integer getStaffId() {
	return staffId;
}
public void setStaffId(Integer staffId) {
	this.staffId = staffId;
}
public String getUserName() {
	return userName;
}
public void setUsername(String userName) {
	this.userName = userName;
}
public String getEncryptedToken() {
	return encryptedToken;
}
public void setEncryptedToken(String encryptedToken) {
	this.encryptedToken = encryptedToken;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public Timestamp getAddStamp() {
	return addStamp;
}
public void setAddStamp(Timestamp addStamp) {
	this.addStamp = addStamp;
}
public Timestamp getUpdateStamp() {
	return updateStamp;
}
public void setUpdateStamp(Timestamp updateStamp) {
	this.updateStamp = updateStamp;
}


public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
public void setUserName(String userName) {
	this.userName = userName;
}


}
