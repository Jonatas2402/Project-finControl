package com.project.finControl.controller.DTOS;

import com.project.finControl.model.TYPE;
import com.project.finControl.model.Transaction;
import com.project.finControl.model.Users;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRequestDTO(BigDecimal value,
                                    LocalDateTime date,
                                    TYPE type,
                                    Long usersId) {
    public Transaction toEntity(Users users){
        Transaction transaction = new Transaction();
        transaction.setValue(value());
        transaction.setDate(date());
        transaction.setType(type());
        transaction.setUsers(users);
        return transaction;
    }
}
