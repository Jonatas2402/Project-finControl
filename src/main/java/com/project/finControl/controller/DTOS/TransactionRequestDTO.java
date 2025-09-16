package com.project.finControl.controller.DTOS;

import com.project.finControl.model.TYPE;
import com.project.finControl.model.Transaction;
import com.project.finControl.model.Users;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRequestDTO(@Positive(message = "O valor deve ser maior que zero.")
                                    BigDecimal value,
                                    @PastOrPresent(message = "A data não pode ser futura.")
                                    LocalDateTime date,
                                    @NotNull(message = "O tipo de transação é obrigatório.")
                                    TYPE type,
                                    @NotNull(message = "O usuário é obrigatório.")
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
