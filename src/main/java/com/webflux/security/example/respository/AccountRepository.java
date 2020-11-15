package com.webflux.security.example.respository;

import com.webflux.security.example.entity.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountRepository extends ReactiveCrudRepository<Account, Integer> {

}
