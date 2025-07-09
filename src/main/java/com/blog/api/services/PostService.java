package com.blog.api.services;

import com.blog.api.payloads.PostDto;

import java.util.List;

public interface PostService {

    //CREATE
    PostDto createPost(PostDto postDto, Long userId, Long categoryId);

    //UPDATE
    PostDto updatePostByPostId(PostDto postDto, Long postId);

    //DELETE
    void deletePostByPostId(Long postId);

    //GET ALL POSTS
    List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);

    //GET SINGLE POST
    PostDto getSinglePostByPostId(Long postId);

    //GET ALL POSTS BY CATEGORY
    List<PostDto> getPostsByCategory(Long categoryId);

    //GET ALL POSTS BY USER
    List<PostDto> getPostsByUser(Long userId);

    //SEARCH POSTS
    List<PostDto> searchPosts(String keyword);


}
