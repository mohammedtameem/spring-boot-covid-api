package com.bytestream.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "covid")
public class CovidData 
{
	
	@Id
	private long deaths;
	private long hospitalized;
	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}
	public void setHospitalized(long hospitalized) {
		this.hospitalized = hospitalized;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCuredPatients(long curedPatients) {
		this.curedPatients = curedPatients;
	}

	private String city;
	private long curedPatients;
	
	public long getDeaths() {
		return deaths;
	}
	public long getHospitalized() {
		return hospitalized;
	}
	public String getCity() {
		return city;
	}
	public long getCuredPatients() {
		return curedPatients;
	}
	
	public CovidData(long deaths, long hospitalized, String city, long curedPatients) {
		super();
		this.deaths = deaths;
		this.hospitalized = hospitalized;
		this.city = city;
		this.curedPatients = curedPatients;
	}
	
	public CovidData() {
	}
	
	

}
