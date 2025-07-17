package com.blog.api.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {

    private Long commentId;

    private String commentContent;

}
