package com.project.finControl.controller.mappers;

import com.project.finControl.controller.DTOS.TransactionRequestDTO;
import com.project.finControl.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {


    TransactionRequestDTO toResponse(Transaction entity);

    @Mapping(target = "users", ignore = true)
    @Mapping(target = "date", expression = "java(LocalDateTime.now())")
    Transaction toEntity(TransactionRequestDTO dto);
}
