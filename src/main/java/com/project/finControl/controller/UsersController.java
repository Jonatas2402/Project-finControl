package com.project.finControl.controller;

import com.project.finControl.controller.DTOS.UsersDTO;
import com.project.finControl.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;
    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody UsersDTO dto){
        var usaerEntidade = dto.mapearUser();
        service.save(usaerEntidade);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
