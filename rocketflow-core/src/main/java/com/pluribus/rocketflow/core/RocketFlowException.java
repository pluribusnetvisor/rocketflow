package com.pluribus.rocketflow.core;

public class RocketFlowException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int code = -1;

	public RocketFlowException(String message) {
		super(message);
	}	
	
	public RocketFlowException(int code, String message) {
		super(message);
		this.code = code;
	}	
	
	public RocketFlowException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public RocketFlowException(Throwable cause) {
		super(cause);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
