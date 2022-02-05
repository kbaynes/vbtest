package com.kevin.VBTest.repository;

import com.kevin.VBTest.entity.BlogPostCategory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostCategoryRepo extends CrudRepository<BlogPostCategory, Long> {

  Iterable<BlogPostCategory> findByName(String name);

  BlogPostCategory findById(long id);
}