package com.geekster.WeekTest.Ecommerce.repo;

import com.geekster.WeekTest.Ecommerce.model.Product;
import com.geekster.WeekTest.Ecommerce.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProductCategory(ProductCategory category);
}