package com.project.finControl.controller.mappers;

import com.project.finControl.controller.DTOS.UsersRequestDTO;
import com.project.finControl.controller.DTOS.UsersResponseDTO;
import com.project.finControl.model.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    //DTO -> entity
    Users toEntity (UsersRequestDTO dot);

    //entity -> DTO
    UsersResponseDTO toResponse (Users entity);

}
