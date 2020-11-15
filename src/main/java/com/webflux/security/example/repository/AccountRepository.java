package com.webflux.security.example.repository;

import com.webflux.security.example.entity.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountRepository extends ReactiveCrudRepository<Account, Integer> {

}
