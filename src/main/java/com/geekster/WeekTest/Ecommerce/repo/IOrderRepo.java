package com.geekster.WeekTest.Ecommerce.repo;


import com.geekster.WeekTest.Ecommerce.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders, Integer> {
}