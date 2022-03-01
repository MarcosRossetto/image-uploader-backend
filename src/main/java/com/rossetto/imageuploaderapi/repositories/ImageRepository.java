package com.rossetto.imageuploaderapi.repositories;

import com.rossetto.imageuploaderapi.models.Image;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends MongoRepository<Image, String> {
  
}