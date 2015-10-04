package org.sample.controller.pojos;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class TeamForm {

	public Long id;
	public Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@NotNull
	public String name;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long teamID) {
		this.id = teamID;
	}
	public String getTeam() {
		return name;
	}
	public void setTeam(String teamName) {
		this.name = teamName;
	}
	
}
