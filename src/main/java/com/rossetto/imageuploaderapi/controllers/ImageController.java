package com.rossetto.imageuploaderapi.controllers;

import java.util.List;

import com.rossetto.imageuploaderapi.models.Image;
import com.rossetto.imageuploaderapi.services.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagens")
public class ImageController {

  @Autowired
  private ImageService imageService;

  @GetMapping
  public ResponseEntity<List<Image>> findAll() {
    return new ResponseEntity<>(imageService.findAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Image> findById(@PathVariable Long id) {
    return new ResponseEntity<>(imageService.findById(id), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Image> save(@RequestBody Image image) {
    return new ResponseEntity<>(imageService.save(image), HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Image> update(@PathVariable Long id, @RequestBody Image image) {
    return new ResponseEntity<>(imageService.update(id, image), HttpStatus.OK);
  }

}
