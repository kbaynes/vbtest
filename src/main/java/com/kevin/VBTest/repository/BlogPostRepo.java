package com.kevin.VBTest.repository;

import java.util.List;

import com.kevin.VBTest.entity.BlogPost;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepo extends CrudRepository<BlogPost, Long> {

  List<BlogPost> findAll();

  BlogPost findById(long id);
}