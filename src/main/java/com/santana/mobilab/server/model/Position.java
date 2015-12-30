package com.santana.mobilab.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int sequence;
	private long latitude;
	private long longitude;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

}
