package com.samdev.study.repositories;

import com.samdev.study.entities.Category;
import com.samdev.study.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
