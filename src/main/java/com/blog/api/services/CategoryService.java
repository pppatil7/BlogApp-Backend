package com.blog.api.services;

import com.blog.api.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    //CREATE
    CategoryDto createCategory(CategoryDto categoryDto);

    //UPDATE
    CategoryDto updateCategoryByCategoryId(CategoryDto categoryDto, Long categoryId);

    //DELETE
    void deleteCategoryCategoryId(Long categoryId);

    //GET
    CategoryDto getCategoryByCategoryId(Long categoryId);

    //GET ALL
    List<CategoryDto> getAllCategories();


}
