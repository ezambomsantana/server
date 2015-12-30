package com.santana.mobilab.server.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private int id;
	private String prefix;
	private String plate;	

	@OneToOne(targetEntity=PlannedRoute.class, fetch=FetchType.EAGER)
	private PlannedRoute line;
	private String garage;
	private String company;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public PlannedRoute getLine() {
		return line;
	}
	public void setLine(PlannedRoute line) {
		this.line = line;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
