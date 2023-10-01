package com.geekster.WeekTest.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private String productDesc;
    @Enumerated(value = EnumType.STRING)
    private ProductCategory productCategory;
    private String productBrand;
}
/*Product Model:
       id:integer
         name:string
         price:integer
         description:string
       category:string
       brand:string*/