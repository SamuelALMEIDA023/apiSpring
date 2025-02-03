package com.samdev.study.repositories;

import com.samdev.study.entities.Order;
import com.samdev.study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
