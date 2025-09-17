package com.project.finControl.service;

import com.project.finControl.controller.DTOS.TransactionRequestDTO;
import com.project.finControl.controller.DTOS.TransactionResponseDTO;
import com.project.finControl.model.Transaction;
import com.project.finControl.model.Users;
import com.project.finControl.repository.TransactionRepository;
import com.project.finControl.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final UsersRepository usersRepository;

    //Cria uma transação

}
