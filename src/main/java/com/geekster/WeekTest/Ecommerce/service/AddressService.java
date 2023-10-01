package com.geekster.WeekTest.Ecommerce.service;

import com.geekster.WeekTest.Ecommerce.model.Address;
import com.geekster.WeekTest.Ecommerce.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address){
        iAddressRepo.save(address);
        return "Address added :) !";
    }

    public List<Address> getAddresses(){
        return (List<Address>) iAddressRepo.findAll();
    }

    public Optional<Address> getAddress(Integer id){
        return iAddressRepo.findById(id);
    }

    public String addListOfUsers(List<Address> addresses){
        iAddressRepo.saveAll(addresses);
        return "Addresses Added :) !";
    }

    public String deleteAddressById(Integer id){
        iAddressRepo.deleteById(id);

        return "Address removed !";
    }


}