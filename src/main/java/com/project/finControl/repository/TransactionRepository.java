package com.project.finControl.repository;

import com.project.finControl.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Optional<Transaction> findById(Long usersId);

    List<Transaction> findByUsersIdAndCategory(Long usersId, String category);

    BigDecimal calBalance(Long userId);

}
