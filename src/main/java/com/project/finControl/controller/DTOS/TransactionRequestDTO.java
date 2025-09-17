package com.project.finControl.controller.DTOS;

import com.project.finControl.model.TYPE;
import com.project.finControl.model.Transaction;
import com.project.finControl.model.Users;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRequestDTO(@Positive(message = "O valor deve ser maior que zero.")
                                    BigDecimal value,
                                    @NotNull(message = "O tipo de transação é obrigatório.")
                                    TYPE type,
                                    @NotBlank(message = "A categoria é obrigatório.")
                                    String category,
                                    Users usersId) {
    public Transaction toEntity(Users users){
        Transaction transaction = new Transaction();
        transaction.setValue(value());
        transaction.setType(type());
        transaction.setCategory(category);
        transaction.setUsers(users);
        return transaction;
    }
}
