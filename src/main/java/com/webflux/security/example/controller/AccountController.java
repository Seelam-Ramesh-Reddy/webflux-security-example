package com.webflux.security.example.controller;

import com.webflux.security.example.entity.Account;
import com.webflux.security.example.respository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/saveAccount")
    public Mono<Account> saveDetails() {
        return accountRepository.save(Account.builder()
                .nick("ramesh")
                .phone("9981234564")
                .build());
    }

    @GetMapping("/getAllDetails")
    public Flux<Account> getAllAccountDetails() {
        return accountRepository.findAll();
    }

    @GetMapping("/getAccountDetails")
    public Mono<Account> getAccountDetails(@PathVariable Integer id) {
        return accountRepository.findById(id);
    }
}

