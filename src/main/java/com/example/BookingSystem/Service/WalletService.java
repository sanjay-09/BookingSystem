package com.example.BookingSystem.Service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WalletService {
    private UserService userService;
    public WalletService(UserService userService){
        this.userService=userService;
    }


   @Transactional
    public void send(Long senderId,Long receiverId,int amount){

        this.userService.debit(senderId,amount);
        this.userService.credit(receiverId,amount); //in this user was not found

    }
}
