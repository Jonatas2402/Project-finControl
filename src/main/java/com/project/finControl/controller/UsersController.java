package com.project.finControl.controller;

import com.project.finControl.controller.DTOS.UsersDTO;
import com.project.finControl.model.Users;
import com.project.finControl.service.UsersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<Void> salvar(@RequestBody @Valid UsersDTO dto){
        var usaerEntidade = dto.mapearUser();
        service.save(usaerEntidade);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    //Implementação de deletar um usuário.
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar (@PathVariable("id") Long id){
        Optional<Users> usersOptional = service.buscarPorId(id);
        if (usersOptional.isEmpty()){
            return ResponseEntity.notFound().build();// Caso não exista usuário ele apresentará um erro.
        }
        service.delete(usersOptional.get());
        return ResponseEntity.noContent().build();
    }

}
