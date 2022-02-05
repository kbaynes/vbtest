package com.kevin.VBTest.service;

import com.kevin.VBTest.entity.BlogPostCategory;
import com.kevin.VBTest.repository.BlogPostCategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BlogPostCategoryService
 */
@Service
public class BlogPostCategoryService {

    @Autowired
    BlogPostCategoryRepo blogPostCategoryRepo;

    public Iterable<BlogPostCategory> findAll() {
        return blogPostCategoryRepo.findAll();
    }

    public BlogPostCategory createCategory(BlogPostCategory blogPostCategory) {
        return blogPostCategoryRepo.save(blogPostCategory);
    }

}