package com.example.BookingSystem.Controller;

import com.example.BookingSystem.Service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    private WalletService walletService;
    public WalletController(WalletService walletService){
        this.walletService=walletService;
    }

    @PostMapping("/send")
    public void sendMoney(@RequestParam Long senderId,@RequestParam Long receiverId,@RequestParam int amount){

        this.walletService.send(senderId,receiverId,amount);
    }
}
