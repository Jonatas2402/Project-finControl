package com.project.finControl.controller.DTOS;

import com.project.finControl.model.Users;

public record UsersDTO(String name,
                       String email,
                       String password) {

    public Users mapearUser(){
        Users users = new Users();

        users.setName(this.name);
        users.setEmail(this.email);
        users.setPassword(this.password);

        return users;
    }
}
