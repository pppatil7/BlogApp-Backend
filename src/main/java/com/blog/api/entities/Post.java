package com.blog.api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String postTitle;

    private String postContent;

    private String postImageName;

    private Date postAddedDate;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;


}
