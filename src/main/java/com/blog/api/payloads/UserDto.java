package com.blog.api.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private Long userId;

    private String userName;

    private String userEmail;

    private String userPassword;

    private String userAbout;

}
