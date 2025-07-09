package com.blog.api.services;

import com.blog.api.payloads.PostDto;
import com.blog.api.payloads.PostResponse;

import java.util.List;

public interface PostService {

    //CREATE
    PostDto createPost(PostDto postDto, Long userId, Long categoryId);

    //UPDATE
    PostDto updatePostByPostId(PostDto postDto, Long postId);

    //DELETE
    void deletePostByPostId(Long postId);

    //GET ALL POSTS
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDirection);

    //GET SINGLE POST
    PostDto getSinglePostByPostId(Long postId);

    //GET ALL POSTS BY CATEGORY
    List<PostDto> getPostsByCategory(Long categoryId);

    //GET ALL POSTS BY USER
    List<PostDto> getPostsByUser(Long userId);

    //SEARCH POSTS
    List<PostDto> searchPosts(String keyword);


}
