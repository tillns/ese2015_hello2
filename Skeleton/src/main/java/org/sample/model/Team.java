package org.sample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Team {
	
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	private String name;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long teamId) {
		this.id = teamId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
