package com.kevin.VBTest.controller;

import com.kevin.VBTest.entity.BlogPost;
import com.kevin.VBTest.entity.BlogPostCategory;
import com.kevin.VBTest.service.BlogPostCategoryService;
import com.kevin.VBTest.service.BlogPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {
    
    @Autowired
    private BlogPostService blogPostService;

    @Autowired
    private BlogPostCategoryService blogPostCategoryService;

    @RequestMapping("/")
    public String index() {
        return "Hello from API";
    }

    /*
    Post
    */

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public Iterable<BlogPost> getPosts() {
        return blogPostService.findAll();
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public BlogPost getPostById(@PathVariable Long id) {
        return blogPostService.findById(id);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public BlogPost createPost(@RequestBody BlogPost blogPost) {
        return blogPostService.createPost(blogPost);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    public BlogPost updatePost(@RequestBody BlogPost blogPost) {
        return blogPostService.updatePost(blogPost);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.DELETE)
    public void deleteAllPost() {
        blogPostService.deletePosts();
    }
    
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable Long id) {
        blogPostService.deletePost(id);
    }

    /*
    Category
    */

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable<BlogPostCategory> getCategories() {
        return blogPostCategoryService.findAll();
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public BlogPostCategory createCategory(@RequestBody BlogPostCategory blogPostCategory)  {
        return blogPostCategoryService.createCategory(blogPostCategory);
    }
}