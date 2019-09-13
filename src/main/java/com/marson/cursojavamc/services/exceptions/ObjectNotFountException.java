package com.marson.cursojavamc.services.exceptions;

public class ObjectNotFountException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFountException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
		
	}
	
	public ObjectNotFountException(String msg , Throwable cause) {
		// TODO Auto-generated constructor stub
		super(msg , cause);
	}

}
