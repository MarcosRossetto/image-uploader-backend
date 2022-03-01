package com.rossetto.imageuploaderapi.repositories;

import com.rossetto.imageuploaderapi.models.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
  
}