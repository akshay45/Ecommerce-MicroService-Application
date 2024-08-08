package com.assignment.group.imageservice.controller;

import com.assignment.group.imageservice.entity.Image;
import com.assignment.group.imageservice.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
@Slf4j
public class ImageController {
    @Autowired
    private ImageService imageService;
    Logger logger= LoggerFactory.getLogger(ImageController.class);
    @GetMapping
    public List<Image> getImages() {
        return imageService.getAllImages();

    }
    @PostMapping
    public Image addImage(@RequestBody Image image) {
        logger.info("Image added");
        return imageService.save(image);



    }
}
