package com.marson.cursojavamc.services.exceptions;

public class DateIntegrityException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DateIntegrityException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
		
	}
	
	public DateIntegrityException(String msg , Throwable cause) {
		// TODO Auto-generated constructor stub
		super(msg , cause);
	}

}
