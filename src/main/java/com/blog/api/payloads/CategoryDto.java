package com.blog.api.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Long categoryId;

    @NotBlank
    @Size(min = 4, message = "category title is of minimum 4")
    private String categoryTitle;

    @NotBlank
    @Size(min = 10, message = "category description is of minimum 10")
    private String categoryDescription;

}
