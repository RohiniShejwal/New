package com.BikkadIT.IRCTC.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passanger {

	@Id
	private int fid;
	
	private String fname;
	
	private String fcity;
	
	private String currentlocation;
	
	private String destination;
	
	private String doj;

	@Override
	public String toString() {
		return "Passanger [fid=" + fid + ", fname=" + fname + ", fcity=" + fcity + ", currentlocation="
				+ currentlocation + ", destination=" + destination + ", doj=" + doj + "]";
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcity() {
		return fcity;
	}

	public void setFcity(String fcity) {
		this.fcity = fcity;
	}

	public String getCurrentlocation() {
		return currentlocation;
	}

	public void setCurrentlocation(String currentlocation) {
		this.currentlocation = currentlocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

}
