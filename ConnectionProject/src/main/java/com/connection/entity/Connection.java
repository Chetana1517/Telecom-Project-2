package com.connection.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Connection {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private String id;
	private String name;
	private String status;
	private String plan;
	private long reference_no;
	
	
	public Connection() {
		super();
		
	}


	public Connection(String id, String name, String status, String plan, long reference_no) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.plan = plan;
		this.reference_no = reference_no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPlan() {
		return plan;
	}


	public void setPlan(String plan) {
		this.plan = plan;
	}


	public long getReference_no() {
		return reference_no;
	}


	public void setReference_no(long reference_no) {
		this.reference_no = reference_no;
	}


	@Override
	public String toString() {
		return "Connection [id=" + id + ", name=" + name + ", status=" + status + ", plan=" + plan + ", reference_no="
				+ reference_no + "]";
	}
	
	

}
