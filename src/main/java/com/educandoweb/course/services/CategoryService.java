package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRespository;

/**
 * CategoryServices
 */
@Service
public class CategoryService {

  @Autowired
  private CategoryRespository repository;

  public List<Category> findAll() {

    return repository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> obj = repository.findById(id);

    return obj.get();
  }

}