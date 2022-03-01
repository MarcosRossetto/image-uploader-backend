package com.rossetto.imageuploaderapi.services;

import java.util.List;

import com.rossetto.imageuploaderapi.models.Image;
import com.rossetto.imageuploaderapi.repositories.ImageRepository;
import com.rossetto.imageuploaderapi.services.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

  @Autowired
  private ImageRepository imageRepository;

  public List<Image> findAll() {
    return imageRepository.findAll();
  }

  public Image findById(Long id) {
    return imageRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
  }

  public Image save(Image image) {
    return imageRepository.save(image);
  }

}