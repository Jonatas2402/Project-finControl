package com.project.finControl.controller;

import com.project.finControl.controller.DTOS.UsersRequestDTO;
import com.project.finControl.controller.DTOS.UsersResponseDTO;
import com.project.finControl.model.Users;
import com.project.finControl.service.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    //Implementação de salvar um usuário.
    @PostMapping
    public ResponseEntity<UsersResponseDTO> salvar(@RequestBody @Valid UsersRequestDTO dto){

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //Implementação de deletar um usuário.
    @DeleteMapping("{id}")
    public void deletar (@PathVariable("id") Long id){
        service.delete(id);
    }

}
