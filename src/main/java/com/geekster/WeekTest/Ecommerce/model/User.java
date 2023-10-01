package com.geekster.WeekTest.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String UserEmail;

    private String userPassword;

    private String userPhoneNo;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    private Address address;
}
/*User Model:
   Id:integer
    name:string
    email:string
   password:string
   phoneNumber:string*/