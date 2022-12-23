package com.prospecta.Exception;



import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


import com.prospecta.Exception.MyErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(productException.class)
	public ResponseEntity<MyErrorDetails> studentExceptionHandler(productException s,WebRequest req){
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestap(LocalDateTime.now());
		err.setMessage(s.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

}
