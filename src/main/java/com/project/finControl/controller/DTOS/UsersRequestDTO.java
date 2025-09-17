package com.project.finControl.controller.DTOS;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

//Request = O que precisa ser mandado como requisição.
public record UsersRequestDTO(@NotBlank(message = "O nome é obrigatório.")
                              String name,
                              @Email(message = "O email precisa ser preenchido.")
                              String email,
                              @NotBlank(message = "Senha é obrigatório.")
                              String password) {
}
