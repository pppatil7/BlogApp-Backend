package com.blog.api.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private Long userId;

    @NotEmpty
    @Size(min = 4,message = "Username must be minimum of 4 characters..!!")
    private String userName;

    @Email(message = "email address is not valid..!!")
    private String userEmail;

    @NotEmpty
    @Size(min = 4,max = 15,message = "Password must be minimum of 4 characters and maximum of 15 characters..!!")
    private String userPassword;

    @NotEmpty
    private String userAbout;

}
