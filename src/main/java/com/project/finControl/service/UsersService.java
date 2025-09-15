package com.project.finControl.service;

import com.project.finControl.model.Users;
import com.project.finControl.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository repository;

    public Users save(Users users){
        return repository.save(users);
    }

    public void delete(Users users){
        repository.delete(users);
    }
}
