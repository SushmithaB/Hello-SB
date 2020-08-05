package com.scheduler.epsilon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//BY adding @Component, telling spring that this is the class for which we need an object, it makes this class as Bean class
@Component
@Scope(value="prototype")
public class Signup {	
	private int sid;
	private String sname;
	//Signup class is dependent on Team class now.
@Autowired
@Qualifier("t1")
	private Team Team;	

	public Signup() {
		super();
		System.out.println("Object Created.");
	}	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Team getTeam() {
		return Team;
	}
	public void setTeam(Team team) {
		Team = team;
	}
	public void show() {
		System.out.println("in show... ");
		Team.status();
	}

}
