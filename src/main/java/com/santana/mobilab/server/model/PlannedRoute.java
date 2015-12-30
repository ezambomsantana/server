package com.santana.mobilab.server.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PlannedRoute {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String lineName;
	
	@OneToMany(targetEntity=Position.class, fetch=FetchType.EAGER)
	private List<Position> positions;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	
	

}
