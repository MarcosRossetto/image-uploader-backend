package com.rossetto.imageuploaderapi.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import com.rossetto.imageuploaderapi.services.exceptions.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
  
  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<StandardError> handle(NotFoundException e, HttpServletRequest request) {
    String error = "Resource not found";
    HttpStatus status = HttpStatus.NOT_FOUND;
    StandardError err = new StandardError(
      Instant.now(), 
      status.value(), 
      error, 
      e.getMessage(), 
      request.getRequestURI()
    );

    return ResponseEntity.status(status).body(err);
  }
}
