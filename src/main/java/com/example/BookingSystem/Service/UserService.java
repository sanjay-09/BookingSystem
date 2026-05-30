package com.example.BookingSystem.Service;

import com.example.BookingSystem.Model.User;
import com.example.BookingSystem.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }



    public void findAllUsers(){
        List<User> users=this.userRepository.findAllUsers();
        System.out.println(users.size());



    }

    @Transactional
    public void debit(Long id,int amount){
        User user=this.userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));

        user.setBalance(user.getBalance()-amount);
        this.userRepository.save(user);


    }


    @Transactional
    public void credit(Long id,int amount){
        User user=this.userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
        user.setBalance(user.getBalance()+amount);
        this.userRepository.save(user);
    }
}
