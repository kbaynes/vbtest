package com.kevin.VBTest.service;

import com.kevin.VBTest.entity.BlogPost;
import com.kevin.VBTest.repository.BlogPostRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BlogPostService
 */
@Service
public class BlogPostService {

    @Autowired
    BlogPostRepo blogPostRepo;

    public Iterable<BlogPost> findAll() {
        return blogPostRepo.findAll();
    }

    public BlogPost findById(Long id) {
        return blogPostRepo.findById(id).orElse(null);
    }

    public BlogPost createPost(BlogPost blogPost) {
        return blogPostRepo.save(blogPost);
    }
    
    public BlogPost updatePost(BlogPost blogPost) {
        return blogPostRepo.save(blogPost);
    }
    
    public void deletePosts() {
        blogPostRepo.deleteAll();
    }
    
    public void deletePost(Long id) {
        blogPostRepo.deleteById(id);
    }

}
