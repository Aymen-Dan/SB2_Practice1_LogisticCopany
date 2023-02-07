package com.example.sb2_practice1.repos;



import com.example.sb2_practice1.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("orderRepository")
public interface OrderRepo extends JpaRepository<Order, Long> {

    List<Order> findAll();
}