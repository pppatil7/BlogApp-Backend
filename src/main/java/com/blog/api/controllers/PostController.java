package com.blog.api.controllers;

import com.blog.api.config.AppConstants;
import com.blog.api.payloads.PostDto;
import com.blog.api.payloads.PostResponse;
import com.blog.api.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/user/{userId}/category/{categoryId}/posts")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto, @PathVariable Long userId, @PathVariable Long categoryId) {
        PostDto createdPost = this.postService.createPost(postDto, userId, categoryId);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }

    //get by user
    @GetMapping("/user/{userId}/posts")
    public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Long userId) {
        List<PostDto> posts = postService.getPostsByUser(userId);
        return ResponseEntity.ok(posts);
    }


    //get by category
    @GetMapping("/category/{categoryId}/posts")
    public ResponseEntity<List<PostDto>> getPostsByCategory(@PathVariable Long categoryId) {
        List<PostDto> posts = postService.getPostsByCategory(categoryId);
        return ResponseEntity.ok(posts);
    }

    //get all posts
    @GetMapping("/posts")
    public ResponseEntity<PostResponse> getAllPosts(
            @RequestParam(value = "pageNumber", defaultValue = AppConstants.PAGE_NUMBER, required = false) Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.PAGE_SIZE, required = false) Integer pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDirection", defaultValue = AppConstants.SORT_DIRECTION, required = false) String sortDirection
    ) {
        PostResponse postResponse = this.postService.getAllPost(pageNumber, pageSize, sortBy, sortDirection);
        return ResponseEntity.ok(postResponse);
    }

    //get single post by post id
    @GetMapping("/posts/{postId}")
    public ResponseEntity<PostDto> getSinglePostByPostId(@PathVariable Long postId) {
        PostDto post = this.postService.getSinglePostByPostId(postId);
        return ResponseEntity.ok(post);
    }

    //delete
    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<?> deletePostByPostId(@PathVariable Long postId) {
        this.postService.deletePostByPostId(postId);
        return ResponseEntity.noContent().build();
    }

    //update
    @PutMapping("/posts/{postId}")
    public ResponseEntity<PostDto> updatePostByPostId(@RequestBody PostDto postDto, @PathVariable Long postId) {
        PostDto post = this.postService.updatePostByPostId(postDto, postId);
        return ResponseEntity.ok(post);
    }

    //search
    @GetMapping("/posts/search/{keyword}")
    public ResponseEntity<List<PostDto>> searchPostByTitle(@PathVariable String keyword) {
        List<PostDto> searchedPosts = this.postService.searchPosts(keyword);
        return ResponseEntity.ok(searchedPosts);
    }


}
