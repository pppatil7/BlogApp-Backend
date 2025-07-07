package com.blog.api.repositories;

import com.blog.api.entities.Category;
import com.blog.api.payloads.CategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
