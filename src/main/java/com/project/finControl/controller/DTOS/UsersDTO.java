package com.project.finControl.controller.DTOS;

import com.project.finControl.model.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsersDTO(@NotBlank(message = "O nome é obrigatório.")
                       String name,
                       @Email(message = "O email precisa ser preenchido.")
                       String email,
                       @NotBlank(message = "Senha é obrigatório.")
                       String password) {

    public Users mapearUser(){
        Users users = new Users();

        users.setName(this.name);
        users.setEmail(this.email);
        users.setPassword(this.password);

        return users;
    }
}
