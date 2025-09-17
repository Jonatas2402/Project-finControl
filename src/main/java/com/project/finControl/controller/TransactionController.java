package com.project.finControl.controller;

import com.project.finControl.controller.DTOS.TransactionRequestDTO;
import com.project.finControl.controller.DTOS.TransactionResponseDTO;
import com.project.finControl.model.Transaction;
import com.project.finControl.model.Users;
import com.project.finControl.service.TransactionService;
import com.project.finControl.service.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final UsersService usersService;


}
