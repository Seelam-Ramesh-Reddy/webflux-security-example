package com.webflux.security.example.controller;

import com.webflux.security.example.entity.Account;
import com.webflux.security.example.repository.AccountRepository;
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
    public Mono<Account> saveDetails(@RequestBody Mono<Account> accountMono) {
        return accountMono.flatMap(accountBody -> accountRepository.save(Account.builder()
                .nick(accountBody.getNick())
                .phone(accountBody.getPhone())
                .build()));
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

