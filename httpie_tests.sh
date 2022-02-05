#!/usr/bin/env bash

# the following must be run on a fresh run of the application

# get API root
echo get API root
http localhost:8080/

echo get all blog posts - returns empty list
http localhost:8080/posts

echo get all blog categories - returns empty list
http localhost:8080/categories

#echo create category - returns created category
#echo '{"title":"My First Post","text":"lorem ipsum","category":{"name":"cat1"}}' | http POST localhost:8080/posts/

echo create post - returns created post
echo '{"title":"My First Post","text":"lorem ipsum","category":{"name":"cat1"}}' | http POST localhost:8080/posts/

echo get all blog categories - returns new category list
http localhost:8080/categories

echo get all blog posts - returns list with first post only
http localhost:8080/posts

echo get blog post by id - returns item
http localhost:8080/posts/1

echo put/update post - returns updated post
echo '{"id":1,"title":"My First Post","text":"lorem ipsum BLAH","category":{"id":2,"name":"cat1"}}' | http PUT localhost:8080/posts/1

echo get blog post by id - returns updated item wth BLAH
http localhost:8080/posts/1

echo delete first post - returns void
http DELETE localhost:8080/posts/1

echo get all blog posts - returns empty list to confirm delete
http localhost:8080/posts

echo create post - returns created post my second post
echo '{"title":"My Second Post","text":"lorem ipsum 2","category":{"name":"cat2"}}' | http POST localhost:8080/posts/

echo get all blog posts - returns the second post list
http localhost:8080/posts

echo delete all posts - returns void
http DELETE localhost:8080/posts

echo get all blog posts - returns empty list to test delete all
http localhost:8080/posts