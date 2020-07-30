package com.thatchana.loginservice.Util;

/**
 * @author Thatchana
 * Login api response
 */

public class Response {
	
	private String status;
	
	private Data data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
