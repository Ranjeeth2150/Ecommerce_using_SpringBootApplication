package com.geekster.WeekTest.Ecommerce.service;

import com.geekster.WeekTest.Ecommerce.model.Address;
import com.geekster.WeekTest.Ecommerce.model.User;
import com.geekster.WeekTest.Ecommerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user){
        iUserRepo.save(user);

        return "User added :) !";
    }

    public List<User> getUsers(){
        return  (List<User>)  iUserRepo.findAll();
    }

    public Optional<User> getUser(Integer id){
        return iUserRepo.findById(id);
    }

    public String updateUserAddressByUserId(Address address, Integer id) {
        User user = iUserRepo.findById(id).orElse(null);
        if (user == null) {
            return "User not found :( !";
        }

        user.setAddress(address);
        return "User address updated :) !";
    }

    public String addListOfUsers(List<User> users){
        iUserRepo.saveAll(users);

        return "Users are Added :) !";
    }

    public String deleteUserById(Integer id){
        iUserRepo.deleteById(id);

        return "User Removed !";
    }
}