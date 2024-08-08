package com.assignment.group.imageservice.service;

import com.assignment.group.imageservice.entity.Image;
import com.assignment.group.imageservice.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;
    public List<Image> getAllImages() {
        return imageRepository.findAll();

    }
    public Image save(Image image) {
        return imageRepository.save(image);
    }

}
