package com.geekster.WeekTest.Ecommerce.repo;

import com.geekster.WeekTest.Ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}