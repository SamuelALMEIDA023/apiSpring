package com.samdev.study.repositories;

import com.samdev.study.entities.Category;
import com.samdev.study.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
