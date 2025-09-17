package com.project.finControl.service;

import com.project.finControl.controller.DTOS.UsersRequestDTO;
import com.project.finControl.controller.DTOS.UsersResponseDTO;
import com.project.finControl.controller.mappers.UsersMapper;
import com.project.finControl.model.Users;
import com.project.finControl.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository repository;
    private final UsersMapper usersMapper;

    public UsersResponseDTO save(UsersRequestDTO dto){
        Users users = usersMapper.toEntity(dto); //Converte DTO -> entity
        Users usersSave = repository.save(users); //Salva o usuário.
        return usersMapper.toResponse(usersSave); //Entity ->DTO
    }
    public List<UsersResponseDTO> findAll(){
        return repository.findAll().
                stream()
                .map(usersMapper::toResponse)//Converte todos os entitys -> DTO
                .toList();
    }

    public UsersResponseDTO findById(Long id){
        return repository.findById(id)
                .map(usersMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }

    public UsersResponseDTO update(Long id, UsersRequestDTO dto){
        Users users = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));

        users.setName(dto.name());
        users.setEmail(dto.email());
        users.setPassword(dto.password());

        return usersMapper.toResponse(repository.save(users));
    }
    public void delete(Long id){
        repository.deleteById(id);;
    }
}
