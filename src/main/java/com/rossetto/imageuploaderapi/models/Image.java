package com.rossetto.imageuploaderapi.models;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("image")
public class Image implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  @Lob
  private String base64Image;

}