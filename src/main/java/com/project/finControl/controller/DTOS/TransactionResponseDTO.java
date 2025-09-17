package com.project.finControl.controller.DTOS;

import com.project.finControl.model.TYPE;
import com.project.finControl.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionResponseDTO(Long id,
                                     BigDecimal value,
                                     LocalDateTime date,
                                     TYPE type,
                                     String name,
                                     String category) {
    public static TransactionResponseDTO fromEntity(Transaction transaction){
        return new TransactionResponseDTO(
                transaction.getId(),
                transaction.getValue(),
                transaction.getDate(),
                transaction.getType(),
                transaction.getCategory(),
                transaction.getUsers().getName()
        );
    }
}
