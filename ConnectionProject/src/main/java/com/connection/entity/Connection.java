package com.connection.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Connection {

	@Id
	private String Connection_id;
	private String Connection_name;
	private String Connection_status;
	private String Connection_plan;
	private Long Connection_reference_no;
	public Connection() {
		super();
	}
	public Connection(String connection_id, String connection_name, String connection_status, String connection_plan,
			Long connection_reference_no) {
		super();
		Connection_id = connection_id;
		Connection_name = connection_name;
		Connection_status = connection_status;
		Connection_plan = connection_plan;
		Connection_reference_no = connection_reference_no;
	}
	public String getConnection_id() {
		return Connection_id;
	}
	public void setConnection_id(String connection_id) {
		Connection_id = connection_id;
	}
	public String getConnection_name() {
		return Connection_name;
	}
	public void setConnection_name(String connection_name) {
		Connection_name = connection_name;
	}
	public String getConnection_status() {
		return Connection_status;
	}
	public void setConnection_status(String connection_status) {
		Connection_status = connection_status;
	}
	public String getConnection_plan() {
		return Connection_plan;
	}
	public void setConnection_plan(String connection_plan) {
		Connection_plan = connection_plan;
	}
	public Long getConnection_reference_no() {
		return Connection_reference_no;
	}
	public void setConnection_reference_no(Long connection_reference_no) {
		Connection_reference_no = connection_reference_no;
	}
	@Override
	public String toString() {
		return "Connection [Connection_id=" + Connection_id + ", Connection_name=" + Connection_name
				+ ", Connection_status=" + Connection_status + ", Connection_plan=" + Connection_plan
				+ ", Connection_reference_no=" + Connection_reference_no + "]";
	}
	
	
	
}
