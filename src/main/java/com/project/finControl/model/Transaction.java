package com.project.finControl.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_transaction")
@ToString(exclude = "users")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "value", precision = 20, scale = 2)
    private BigDecimal value;
    @Column(name = "type", length = 20)
    @Enumerated(EnumType.STRING)
    private TYPE type;
    @Column(name = "category", length = 150)
    private String category;
    @Column(name = "date")
    private LocalDateTime date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

}
