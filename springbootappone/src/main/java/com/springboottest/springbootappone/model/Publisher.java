package com.springboottest.springbootappone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String publisherName;
	private String addressLine;
	private String city;
	private String state;
	private String zip;
	
	
	public Publisher(String publisherName, String addressLine, String city, String state, String zip) {
		super();
		this.publisherName = publisherName;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
