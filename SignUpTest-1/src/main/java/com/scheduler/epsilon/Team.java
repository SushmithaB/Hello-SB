package com.scheduler.epsilon;

import org.springframework.stereotype.Component;

@Component("t1")
public class Team {
	
	private String tname;
	private String role;
	private int ID;
	
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "Team [tname=" + tname + ", role=" + role + ", ID=" + ID + "]";
	}
	
	public void status() {
		System.out.println("Active");
	}
	

}
