package com.blog.api.services.impl;

import com.blog.api.entities.Category;
import com.blog.api.entities.Post;
import com.blog.api.entities.User;
import com.blog.api.exceptions.ResourceNotFoundException;
import com.blog.api.payloads.PostDto;
import com.blog.api.repositories.CategoryRepository;
import com.blog.api.repositories.PostRepository;
import com.blog.api.repositories.UserRepository;
import com.blog.api.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public PostDto createPost(PostDto postDto, Long userId, Long categoryId) {
        User user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "userId", userId));
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
        Post post = this.modelMapper.map(postDto, Post.class);
        post.setPostImageName("default.png");
        post.setPostAddedDate(new Date());
        post.setUser(user);
        post.setCategory(category);

        Post savedPost = this.postRepository.save(post);
        return this.modelMapper.map(savedPost, PostDto.class);
    }

    @Override
    public PostDto updatePostByPostId(PostDto postDto, Long postId) {
        return null;
    }

    @Override
    public void deletePostByPostId(Long postId) {

    }

    @Override
    public List<PostDto> getAllPost() {
        return List.of();
    }

    @Override
    public PostDto getSinglePostByPostId(Long postId) {
        return null;
    }

    @Override
    public List<PostDto> getPostsByCategory(Long categoryId) {
        return List.of();
    }

    @Override
    public List<PostDto> getPostsByUser(Long userId) {
        return List.of();
    }

    @Override
    public List<PostDto> searchPosts(String keyword) {
        return List.of();
    }
}
