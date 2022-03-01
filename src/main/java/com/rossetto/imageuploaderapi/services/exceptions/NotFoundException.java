package com.rossetto.imageuploaderapi.services.exceptions;

public class NotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  
  public NotFoundException(String id) {
    super("Resource not found: " + id);
  }
}
