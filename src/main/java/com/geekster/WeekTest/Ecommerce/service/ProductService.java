package com.geekster.WeekTest.Ecommerce.service;

import com.geekster.WeekTest.Ecommerce.model.Product;
import com.geekster.WeekTest.Ecommerce.model.ProductCategory;
import com.geekster.WeekTest.Ecommerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addAProduct(Product product){
        iProductRepo.save(product);
        return "Product added :) !";
    }

    public List<Product> getProducts(){
        return (List<Product>) iProductRepo.findAll();
    }

    public Optional<Product> getProduct(Integer id){
        return iProductRepo.findById(id);
    }

    public List<Product> getProductByCategory(ProductCategory category){
        return iProductRepo.findByProductCategory(category);
    }

    public String addListOfProducts(List<Product> products){
        iProductRepo.saveAll(products);
        return "Products are added :) !";
    }

    public String deleteProductById(Integer id){
        iProductRepo.deleteById(id);
        return "Product removed !";
    }

}