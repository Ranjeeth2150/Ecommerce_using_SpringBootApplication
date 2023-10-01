package com.geekster.WeekTest.Ecommerce.repo;

import com.geekster.WeekTest.Ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {
}