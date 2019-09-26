package com.marson.cursojavamc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.marson.cursojavamc.services.exceptions.DateIntegrityException;
import com.marson.cursojavamc.services.exceptions.ObjectNotFountException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFountException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFountException e , HttpServletRequest request){
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value() , e.getMessage() , System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DateIntegrityException.class)
	public ResponseEntity<StandardError> dateIntegrity(DateIntegrityException e , HttpServletRequest request){
		StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value() , e.getMessage() , System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
}
