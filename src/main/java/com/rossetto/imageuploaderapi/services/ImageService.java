package com.rossetto.imageuploaderapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.rossetto.imageuploaderapi.models.Image;
import com.rossetto.imageuploaderapi.repositories.ImageRepository;
import com.rossetto.imageuploaderapi.services.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

  @Autowired
  private ImageRepository imageRepository;

  public List<Image> findAll() {
    return imageRepository.findAll();
  }

  public Image findById(String id) {
    return imageRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
  }

  public Image save(Image image) {
    return imageRepository.save(image);
  }

  public Image update(String id, Image image) {
    try {
      Image imageUpdate = findById(id);
      updateData(imageUpdate, image);
      return imageRepository.save(imageUpdate);
    } catch(EntityNotFoundException e) {
      throw new NotFoundException(id);
    }
  }

  public void delete(String id) {
    try {
      imageRepository.deleteById(id);
    } catch(EmptyResultDataAccessException e) {
      throw new NotFoundException(id);
    }
  }

  private void updateData(Image imageUpdate, Image image) {
    imageUpdate.setBase64Image(image.getBase64Image());
  }

}