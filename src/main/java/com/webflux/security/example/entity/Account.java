package com.webflux.security.example.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * Account
 *
 * @author linux_china
 */
@Table("account")
@Data
@Builder(builderClassName = "builder")
public class Account {
    @Id
    private Integer id;
    private String nick;
    private String email;
    private String phone;
    @Column("passwd")
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
